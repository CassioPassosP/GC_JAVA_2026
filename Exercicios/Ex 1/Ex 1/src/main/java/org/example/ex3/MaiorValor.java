package org.example.ex3;

import java.util.Collections;
import java.util.List;

public class MaiorValor {

    public void getMaiorValor(List<Integer> listaValores) {
        Integer maior = Collections.max(listaValores);

        System.out.println("O maior valor e o: " + maior);
    }
}
