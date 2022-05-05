package exercicioresolvido02;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt(), valor = 0, quantidade = 0;
        
        while(idade > 0){
            valor += idade;
            quantidade += 1;
            idade = sc.nextInt();
        }
        
        if(valor == 0){
            System.out.println("impossivel calcular");
        }else{
            double media = (double) valor / quantidade;
            System.out.printf("%.2f\n", media);
        }
        
        sc.close();
    }
    
}
