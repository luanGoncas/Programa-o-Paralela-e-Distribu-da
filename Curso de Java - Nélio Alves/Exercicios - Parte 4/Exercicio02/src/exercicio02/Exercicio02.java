package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), X = 0, in = 0, out = 0;
        
        for(int i = 0; i < N; i++){
            X = sc.nextInt();
            if(X >= 10 && X <= 20)
                in++;
            else
                out++;
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");
        
        sc.close();
    }
    
}
