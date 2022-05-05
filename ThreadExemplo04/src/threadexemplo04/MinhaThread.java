package threadexemplo04;

public class MinhaThread implements Runnable{
    //private String nome;
    private int tempo;
    private int limite;
    private int inicio;
    
    public MinhaThread(int tempo, int limite, int inicio){
        //this.nome = nome;
        this.tempo = tempo;
        this.limite = limite;
        this.inicio = inicio;
    }
    
    public void run(){
        try{
            for (int i = inicio; i < limite; i++) {
            System.out.print(i++);
            Thread.sleep(this.tempo);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        //System.out.println(this.nome + " finalizada!");
    }
}
