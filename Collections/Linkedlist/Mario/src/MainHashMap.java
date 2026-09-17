import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String, String> habilidades = new HashMap<>();

        habilidades.put("Mario", "Fireball");
        habilidades.put("Luigi", "Poltergust");
        habilidades.put("Yoshi", "Flutter jump");
        habilidades.put("Peach", "Float");
        habilidades.put("Toad", "Speed boost");

        //busca direta pela chave
        String h = habilidades.get("Luigi");
        System.out.println(h); // "Poltergust"

        System.out.println("\nPersonagens e suas habilidades: \n");
        //iterar sobre todos
        for (Map.Entry<String, String> e : habilidades.entrySet()){ // .entrySet -> pega a chave e valor do elemento
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}