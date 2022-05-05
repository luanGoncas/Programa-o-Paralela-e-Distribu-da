package threadexemplo06;

import java.util.List;
import java.util.ArrayList;

public class ThreadExemplo06 {

    public static void main(String[] args) {
        List<Integer> filaDeTarefas = new ArrayList<Integer>();
        
        Produtor p = new Produtor(filaDeTarefas, 5, "Produtor");
        Consumidor c = new Consumidor(filaDeTarefas, "Consumidor");
    }
    
}
