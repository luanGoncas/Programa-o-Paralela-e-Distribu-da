package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        int horasTrab = sc.nextInt();
        double valorHora = sc.nextDouble();
        
        double salario = valorHora * horasTrab;
        
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        
        sc.close();
    }
    
}
