package list.Set;

import java.util.HashSet;
import java.util.Set;

public class ExemploOrdenacaoSet {
    public static void main (String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Run BTS", "Variedades", 80));
            add(new Serie("The Glory", "Drama", 90));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
        + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}



