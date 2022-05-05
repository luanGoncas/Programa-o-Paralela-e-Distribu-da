package threadexemplo05;

public class Calculadora {
    private Integer soma;
    
    public synchronized Integer somar(Integer[] numeros){
        soma = 0;
        
        for (Integer num : numeros) {
            soma += num;
            
            System.out.println("Executando " + Thread.currentThread().getName() + " somando o número " + num + " totalizando " + soma);
        
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        return soma;
    }
}
