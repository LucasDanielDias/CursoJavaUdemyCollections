package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class aula2Sets {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<String>();//define um tipo de especifico de set
        Set<String> lista = new TreeSet<String>();//define  a lista em ordem alfabetica
        lista.add("manuel");
        lista.add("zmanuel");
        lista.add("patrick");
        lista.add("manuel");//sets não guardam valores repetidos
        lista.add("lucas");
        lista.add("louro joze" +//pode ter espaço
                " arthur");
        for(String candidato: lista){
            System.out.println(candidato);
        }
    }
}
