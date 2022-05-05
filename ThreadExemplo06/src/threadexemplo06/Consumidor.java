package threadexemplo06;

import java.util.List;

public class Consumidor implements Runnable{
    private String nome;
    private final List<Integer> filaDeTarefas;
    
    public Consumidor(List<Integer> filaCompartilhada, String nome){
        this.filaDeTarefas = filaCompartilhada;
        this.nome = nome;
        new Thread(this, nome).start();
    }
    
    @Override
    public void run(){
        while(true){
            try {
                consumir();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void consumir() throws InterruptedException{
        synchronized (filaDeTarefas){
            while(filaDeTarefas.isEmpty()){
                System.out.println("A fila está vazia. " + Thread.currentThread().getName() + " está esperando. Tamanho atual: " + filaDeTarefas.size());
                filaDeTarefas.wait();
            }
            
            Thread.sleep(1000);
            int i = (Integer)filaDeTarefas.remove(0);
            System.out.println("Consumido: " + i);
            filaDeTarefas.notifyAll();
        }
    }
}
