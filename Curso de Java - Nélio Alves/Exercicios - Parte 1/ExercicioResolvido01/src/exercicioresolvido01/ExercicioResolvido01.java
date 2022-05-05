package exercicioresolvido01;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

    public static void main(String[] args) {
        double largura, comprimento, valorMetro, area, preco;
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        valorMetro = sc.nextDouble();
        
        area = largura * comprimento;
        preco = area * valorMetro;
        
        System.out.printf("AREA = %.2f\n", area);
        System.out.printf("PRECO = %.2f\n", preco);
        
        sc.close();
    }
}
