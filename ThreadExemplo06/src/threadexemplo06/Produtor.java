package threadexemplo06;

import java.util.List;

public class Produtor implements Runnable{
    private String nome;
    private final List<Integer> filaDeTarefas;
    private final int CAPACIDADE_MAXIMA;
    
    public Produtor(List<Integer> filaCompartilhada, int tamanho, String nome){
        this.filaDeTarefas = filaCompartilhada;
        this.CAPACIDADE_MAXIMA = tamanho;
        this.nome = nome;
        new Thread(this, nome).start();
    }
    
    @Override
    public void run(){
        int contador = 0;
        
        while(true){
            try {
                produzir(contador++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void produzir(int i) throws InterruptedException{
        synchronized (filaDeTarefas){
            while(filaDeTarefas.size() == CAPACIDADE_MAXIMA){
                System.out.println("A fila está cheia. " + Thread.currentThread().getName() + " está esperando. Tamanho atual: " + filaDeTarefas.size());
                filaDeTarefas.wait();
            }
            
            Thread.sleep(1000);
            filaDeTarefas.add(i);
            System.out.println("Produzido: " + i);
            filaDeTarefas.notifyAll();
        }
    }
}