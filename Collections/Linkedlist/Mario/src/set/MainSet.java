package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> personagem = new HashSet<>();

        personagem.put("Mario");
        personagem.put("Luigi");
        personagem.put("Yoshi");
        personagem.put("Peach");
        personagem.put("Toad");

        //busca direta pela chave
        Integer h = personagem.get("Luigi");
        System.out.println(h); // "Poltergust"

        System.out.println("\nPersonagens e suas vidas: \n");
        //iterar sobre todos
        for (Map.Entry<String, Integer> e : personagem.){ // .entrySet -> pega a chave e valor do elemento
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}