package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), fat = 1, aux = 0; 
        
        if(N == 0){
            fat = 1;
        }else{
            fat = N;
            for(int i = N; i > 1 && N != 0; i--){
                fat *= (i - 1);
            }
        }
        
        System.out.println(fat);
        
        sc.close();
    }
}
