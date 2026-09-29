import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> personagens = new ArrayList<>();

        personagens.add(new Warrior("Aragorn", "Poção de força", 15, 8));
        personagens.add(new Wizard("Gandalf", "Poção de mana", 12, 20));
        personagens.add(new Warrior("Xena", "Poção de resistência", 10, 12));
        personagens.add(new Wizard("Merlin", "Poção de mana", 14, 5));

        System.out.println("=== Rodada de ataque ===");

        for (int i = 0; i < personagens.size(); i++) {
            Character atacante = personagens.get(i);
            Character alvo = personagens.get((i + 1) % personagens.size()); // % -> faz o ultimo personagem atacar o primeiro apontando o atack dele para o indice 0 de personagens

            System.out.println("\n" + atacante.getName() + " ataca " + alvo.getName() + ":");
            atacante.atack(alvo);
        }

    }
}
