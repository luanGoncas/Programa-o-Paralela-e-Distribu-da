package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            double X1 = sc.nextDouble();
            double X2 = sc.nextDouble();
            double X3 = sc.nextDouble();
            
            double media = ((X1 * 2.0) + (X2 * 3.0) + (X3 * 5.0))/10.0;
            System.out.printf("%.1f\n", media);
        }
        
        sc.close();
    }
    
}
