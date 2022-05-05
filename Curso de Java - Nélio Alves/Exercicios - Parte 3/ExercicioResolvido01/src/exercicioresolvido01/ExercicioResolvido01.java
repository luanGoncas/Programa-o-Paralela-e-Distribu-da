package exercicioresolvido01;

import java.util.Scanner;

public class ExercicioResolvido01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int X = 0;
        int Y = 1;
        
        while(X != Y){
            X = sc.nextInt();
            Y = sc.nextInt();
            if(X > Y)
                System.out.println("Decrescente");
            else if(X < Y)
                System.out.println("Crescente");
        }
        
        sc.close();
    }
}
