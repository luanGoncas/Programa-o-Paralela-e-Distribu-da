package threadexemplo05;

public class ThreadExemplo05 {

    public static void main(String[] args) {
        Integer[] numeros = new Integer[] {1, 2, 3, 4, 5};
        MinhaThread thread1 = new MinhaThread("Thread 1", numeros);
        MinhaThread thread2 = new MinhaThread("Thread 2", numeros);
    }
    
}
