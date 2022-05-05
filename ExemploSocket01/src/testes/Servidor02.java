package testes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor02 {

    public static void main(String[] args) throws IOException {
        
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta e aguardando conexões...");

        Socket cliente = servidor.accept();
        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
        
        OutputStream arquivoEntradas = new FileOutputStream("EntradasDeArquivo.txt");
        OutputStreamWriter entradasGravadas = new OutputStreamWriter(arquivoEntradas);
        BufferedWriter escritor = new BufferedWriter(entradasGravadas);
        
        Scanner entrada = new Scanner(cliente.getInputStream());
        String entradaUsuario;
         
        while (entrada.hasNextLine()) {
            entradaUsuario = entrada.nextLine();
            System.out.println(entradaUsuario);
            escritor.write(entradaUsuario);
            escritor.newLine();
            escritor.flush();
        }

        entrada.close();
        servidor.close();
    }
}
