package threadexemplo01;

/*
class TarefaEspecial implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 200; i++){
            System.out.print("U");
        }
    }
}
*/

class Tarefa1 implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i < 6; i++){
            System.out.print(i);
        }
    }
}

class Tarefa2 implements Runnable{
    @Override
    public void run(){
        for(int i = 6; i < 11; i++){
            System.out.print(i);
        }
    }
}

class Tarefa3 implements Runnable{
    @Override
    public void run(){
        for(int i = 11; i < 16; i++){
            System.out.print(i);
        }
    }
}

/*
class Tarefa extends Thread{
    
    public void run(){
        rodar();
    }
    
    public void rodar(){
        for(int i = 0; i < 200; i++){
            System.out.print("T");
        }
    }
}
*/

public class ThreadExemplo01 {
    
    public static void main(String[] args) {
        
        /*
        Tarefa t1 = new Tarefa();
        t1.start();
        
        for(int i = 0; i < 200; i++){
            System.out.print("S");
        }
        
        TarefaEspecial te = new TarefaEspecial();
        Thread t2 = new Thread(te);
        t2.start();
        */
        
        Tarefa1 te = new Tarefa1();
        Thread t1 = new Thread(te);
        t1.start();
        
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Tarefa2 te2 = new Tarefa2();
        Thread t2 = new Thread(te2);
        t2.start();
        
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Tarefa3 te3 = new Tarefa3();
        Thread t3 = new Thread(te3);
        t3.start();
        
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    
}
