package POO2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(); // USAR WRAPPER CLASS

        lista.add("Maria"); // adicionar coisas na lista
        lista.add("Mario"); 
        lista.add("Anna"); 
        lista.add("Kleber");

        lista.add(2, "Marco"); // Coloca oque foi pedido na posição 2, lembrando que começa do 0.

        System.out.println(lista.size()); // printa o tamanho da lista
        
        for (String x : lista){
            System.out.println(x);
        }

        System.out.println("----------------------");

        // lista.remove("Anna");
        // lista.remove(1);

        lista.removeIf(x -> x.charAt(0) == 'M');
        for (String x : lista){
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Lugar de Anna: " + lista.indexOf("Anna"));

        System.out.println("---------------------");
        
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Converte pra String, faz a operação requerida, e volta pra lista.
        for(String x : resultado){
            System.out.println(x);
        }

        System.out.println("---------------------");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
        System.out.println(nome);
    }
}