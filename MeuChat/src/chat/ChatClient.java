package chat;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    
    static JFrame chatJanela = new JFrame("Meu Chat");
    static JTextArea chatMensagens = new JTextArea(22, 40);
    static JTextField chatNovaMensagem = new JTextField(40);
    static JButton chatBotaoEnviar = new JButton("Enviar");
    static BufferedReader entrada;
    static PrintWriter saida;
    static JLabel chatUsuarioLogado = new JLabel("");
    
    public ChatClient(){
        chatJanela.setLayout(new FlowLayout());
        chatJanela.add(chatUsuarioLogado);
        chatJanela.add(new JScrollPane(chatMensagens));
        chatJanela.add(chatNovaMensagem);
        chatJanela.add(chatBotaoEnviar);
        
        chatJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatJanela.setSize(475, 500);
        chatJanela.setVisible(true);
        chatMensagens.setEditable(false);
        chatNovaMensagem.setEditable(false);
        
        chatBotaoEnviar.addActionListener(new Listener());
        chatNovaMensagem.addActionListener(new Listener());
    }
    
    public void iniciarChat() throws Exception{
        String enderecoIP = JOptionPane.showInputDialog(chatJanela, "Endereço IP do servidor: ", "Informação", JOptionPane.PLAIN_MESSAGE);
        Socket usuario = new Socket(enderecoIP, 9086);
        
        entrada = new BufferedReader(new InputStreamReader(usuario.getInputStream()));
        saida = new PrintWriter(usuario.getOutputStream(), true);
        
        while(true){
            String msg = entrada.readLine();
            
            if(msg.equals("NOME_REQUERIDO")){
                String nome = JOptionPane.showInputDialog(chatJanela, "Nome do usuário: ", "Informação", JOptionPane.PLAIN_MESSAGE);
                saida.println(nome);
            } else if(msg.equals("NOME_EXISTENTE")){
                String nome = JOptionPane.showInputDialog(chatJanela, "Informe outro nome do usuário: ", "Nome duplicado", JOptionPane.WARNING_MESSAGE);
                saida.println(nome);
            } else if(msg.startsWith("NOME_ACEITO")){
                chatNovaMensagem.setEditable(true);
                chatUsuarioLogado.setText("Você está logado como: " + msg.substring(11));
            } else {
                chatMensagens.append(msg + "\n");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        ChatClient chat = new ChatClient();
        chat.iniciarChat(); 
    }
    
}

class Listener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        ChatClient.saida.println(ChatClient.chatNovaMensagem.getText());
        ChatClient.chatNovaMensagem.setText("");
    }
}