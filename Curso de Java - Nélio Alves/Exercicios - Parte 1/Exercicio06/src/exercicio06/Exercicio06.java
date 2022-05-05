package exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double areaTri = (A * C)/2.0;
        double areaCirc = pi * C * C;
        double areaTrap = ((A + B)/2.0) * C;
        double areaQuad = B * B;
        double areaRet = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
        System.out.printf("QUADRADO: %.3f\n", areaQuad);
        System.out.printf("RETANGULO: %.3f\n", areaRet);
        
        sc.close();
    }
    
}
