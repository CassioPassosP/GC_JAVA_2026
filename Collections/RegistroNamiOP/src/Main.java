import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rotaGrandLine = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();

        rotaGrandLine.add("East Blue");
        rotaGrandLine.add("Alabasta");
        rotaGrandLine.add("Water 7");

        System.out.println("Ilhas visitadas na Grand Line: ");
        for(String ilha : rotaGrandLine){
            System.out.println(ilha);
        }

        //objeto criado para percorrer um elemento de colecoes
        Iterator iterador = rotaGrandLine.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }

        linkedlist.add(rotaGrandLine.size());

        System.out.println(linkedlist);
    }
}