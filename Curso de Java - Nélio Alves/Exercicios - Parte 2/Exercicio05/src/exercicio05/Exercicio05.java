package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double precoCachorro = 4.00, precoSalada = 4.50, precoBacon = 5.00, 
                precoTorrada = 2.00, precoRefri = 1.50, valor = 0;
        
        int pedido = sc.nextInt();
        int quant = sc.nextInt();
        
        if(pedido == 1)
            valor = precoCachorro * quant;
        else if(pedido == 2)
            valor = precoSalada * quant;
        else if(pedido == 3)
            valor = precoBacon * quant;
        else if(pedido == 4)
            valor = precoTorrada * quant;
        else if(pedido == 5)
            valor = precoRefri * quant;
        
        System.out.printf("Total: R$ %.2f\n", valor);
        
        sc.close();
    }
    
}
