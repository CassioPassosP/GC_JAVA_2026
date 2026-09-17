import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MainHashMap2 {
    public static void main(String[] args) {
        Map<String, Integer> hp = new HashMap<>();

        hp.put("Mario", 150);
        hp.put("Luigi", 140);
        hp.put("Yoshi", 60);
        hp.put("Peach", 90);
        hp.put("Toad", 40);

        //busca direta pela chave
        Integer h = hp.get("Luigi");
        System.out.println(h); // "Poltergust"

        System.out.println("\nPersonagens e suas vidas: \n");
        //iterar sobre todos
        for (Map.Entry<String, Integer> e : hp.entrySet()){ // .entrySet -> pega a chave e valor do elemento
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}