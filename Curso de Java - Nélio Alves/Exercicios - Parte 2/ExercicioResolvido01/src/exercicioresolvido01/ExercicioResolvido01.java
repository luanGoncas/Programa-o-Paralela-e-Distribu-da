package exercicioresolvido01;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        
        double total = nota1 + nota2;
        
        if(total >= 60.00){
            System.out.printf("NOTA FINAL = %.1f\n", total);
        }else{
            System.out.printf("NOTA FINAL = %.1f\nREPROVADO\n", total);
        }
        
        sc.close();
    }
    
}
