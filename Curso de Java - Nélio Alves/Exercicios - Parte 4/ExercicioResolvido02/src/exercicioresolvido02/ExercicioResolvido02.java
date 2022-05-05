package exercicioresolvido02;

import java.util.Scanner;

public class ExercicioResolvido02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int somaImpar = 0;
        
        if(X > Y){
            for(int i = Y + 1; i < X; i++){
                if(i % 2 != 0)
                    somaImpar += i;
            }
        }else if(Y > X){
            for(int i = X + 1; i < Y; i++){
                if(i % 2 != 0)
                    somaImpar += i;
            }
        }
        
        System.out.println(somaImpar);
        
        sc.close();
    }
    
}
