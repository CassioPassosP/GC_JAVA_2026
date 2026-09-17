import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        //ArrayList acesso rapido por indice
        long inicio = System.nanoTime();
        List<String> personagem = new ArrayList<>();

        personagem.add("Mario");
        personagem.add("Luigi");
        personagem.add("Peach");
        personagem.add("Yoshi");

        System.out.println(personagem.get(0)); // Mario
        personagem.remove(3); //rempve yoshi
        personagem.clear(); // limpa tudo

        long fim = System.nanoTime();
        long duracaoNano = fim - inicio;

        // Convertendo para milissegundos
        long duracaoMs = duracaoNano / 1_000_000;

        System.out.println("Tempo de execução: " + duracaoMs + " ms");

        //LinkedList, insercao e remocao eficiente
        List<String> inimigos = new LinkedList<>();
        inimigos.add("Goomba");
        inimigos.add("Koopa");
        inimigos.remove(0);

        Iterator<String> it = inimigos.iterator();

        System.out.println("Inimigos: \n");

        while (it.hasNext()) {
            String ini = it.next();
            System.out.println(ini);
        }

    }
}