package threadexemplo05;

public class MinhaThread implements Runnable{
    private String nome;
    private Integer[] numeros;
    private static Calculadora calc = new Calculadora();
    
    public MinhaThread(String nome, Integer[] numeros){
        this.nome = nome;
        this.numeros = numeros;
        new Thread(this, nome).start();
    }
    
    @Override
    public void run(){
        System.out.println(this.nome + " iniciada!");
        Integer soma = calc.somar(numeros);
        System.out.println("Soma pela " + this.nome + " é: " + soma);
        System.out.println(this.nome + "encerrada!");
    }
}
