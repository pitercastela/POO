package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Lista1 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("baguette");
        lista.add("Ovo");
        lista.add("salada");
        lista.add("salada"); //não é uma duplicata pois são dois objetos String diferentes, com o mesmo conteúdo
        lista.add("alho-poró");
        String itemDaLista = "café";
        lista.add(itemDaLista);
        lista.add(itemDaLista); //isto é uma duplicata

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

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
