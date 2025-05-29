package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<String> lista = new LinkedHashSet<String>(); //garante a ordem de inserção
        lista.add("baguette");
        lista.add("Ovo");
        lista.add("salada");
        lista.add("salada"); //não é uma duplicata pois são dois objetos String diferentes, com o mesmo conteúdo
        lista.add("alho-poró");
        String itemDaLista = "café";
        lista.add(itemDaLista);
        lista.add(itemDaLista); //isto é uma duplicata


        // Iteração usando for each
        for(String i : lista){
            System.out.println(i);
        }
        //for each com expressão lambda
        lista.forEach(i -> System.out.println(i));

        //Iteração usando um iterador
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
