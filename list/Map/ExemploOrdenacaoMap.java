package list.Map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args){


        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O poder do hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro :meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O poder do hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro :meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Alfabética Autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro :meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new  TreeSet<>(new Livro.ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro :meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


    }
}
