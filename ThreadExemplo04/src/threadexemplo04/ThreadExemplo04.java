package threadexemplo04;

public class ThreadExemplo04 {

    public static void main(String[] args) {
        
        MinhaThread thread1 = new MinhaThread(500, 5, 0);
        MinhaThread thread2 = new MinhaThread(500, 10, 5);
        MinhaThread thread3 = new MinhaThread(500, 15, 10);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
