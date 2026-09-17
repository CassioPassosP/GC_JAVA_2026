import java.util.*;

public class MainTreeMap{
    public static void main(String[] args) {
        Map<String, String> habilidades = new TreeMap<>();

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
        for (Map.Entry<String, String> e : habilidades.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}