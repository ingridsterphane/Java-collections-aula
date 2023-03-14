package list.Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploOrdenacaoMap {
    public static void main(String[] args){


        System.out.println("--\tOrdem Aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put(" Duhigg, Charles", new Livro("O poder do hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
    }
}
