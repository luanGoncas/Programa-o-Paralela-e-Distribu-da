package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double divisao = 0;
        
        for(int i = 0; i < N; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n2 == 0){
                System.out.println("divisao impossivel");
            }else{
                divisao = (double) n1 / n2;
                System.out.printf("%.1f\n", divisao);
            }
        }
        
        sc.close();
    }
    
}
