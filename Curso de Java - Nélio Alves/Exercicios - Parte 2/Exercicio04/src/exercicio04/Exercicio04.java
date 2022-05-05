package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int horaInicial, horaFinal, horaTotal = 0;
        
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        
        if(horaInicial > 12)
            horaTotal = (24 - horaInicial) + horaFinal;
        else if(horaFinal > 12)
                horaTotal = horaFinal - horaInicial;
            else
                horaTotal = 24;
        
        System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
        
        sc.close();
    }
    
}
