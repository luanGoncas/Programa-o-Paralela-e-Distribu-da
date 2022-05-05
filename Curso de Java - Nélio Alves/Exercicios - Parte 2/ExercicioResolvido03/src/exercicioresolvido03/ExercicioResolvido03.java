package exercicioresolvido03;

import java.util.Scanner;

public class ExercicioResolvido03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a < b){
            if(a < c){
                System.out.println("MENOR = " + a);
            }else{
                if(a == b || a == c){
                    System.out.println("MENOR = " + a);
                }
            }
        }
        
        if(b < a){
            if(b < c){
                System.out.println("MENOR = " + b);
            }else{
                if(b == a || b == c){
                    System.out.println("MENOR = " + b);
                }
            }
        }
        
        if(c < a){
            if(c < b){
                System.out.println("MENOR = " + c);
            }else{
                if(c == a || c == b){
                    System.out.println("MENOR = " + c);
                }
            }
        }
        
        if(a == b && a == c && b == c){
            System.out.println("MENOR = " + a);
        }
        
        sc.close();
    }
    
}
