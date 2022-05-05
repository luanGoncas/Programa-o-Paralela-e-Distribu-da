package exercicioresolvido02;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double delta = (b * b) - (4 * a * c);
        
        if(delta < 0 || a == 0){
            System.out.printf("Impossivel calcular\n");
        }else{
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", raiz1);
            System.out.printf("R2 = %.5f\n", raiz2);
        }
        
        sc.close();
    }
    
}
