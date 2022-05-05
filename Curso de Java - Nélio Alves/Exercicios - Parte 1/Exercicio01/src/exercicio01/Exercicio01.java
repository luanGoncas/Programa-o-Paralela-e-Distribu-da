package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x + y;
        
        System.out.println("SOMA = " + soma);
        
        sc.close();
    }
    
}
