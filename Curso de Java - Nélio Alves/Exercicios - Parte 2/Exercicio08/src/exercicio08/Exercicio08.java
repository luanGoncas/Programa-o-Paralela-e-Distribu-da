package exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double salario = sc.nextDouble();
        double imposto = 0;
        
        if(salario >= 2000.01 && salario <= 3000.00)
            imposto = (salario - 2000.00) * 0.08;
        else if(salario >= 3000.01 && salario <= 4500.00)
            imposto = ((salario - 3000.00) * 0.18) + ((1000.00 * 0.08));
        else
            imposto = ((salario - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);
        
        
        if(salario >= 0.00 && salario <= 2000.00)
            System.out.println("Isento");
        else
            System.out.printf("R$ %.2f\n", imposto);
        
        sc.close();
    }
    
}
