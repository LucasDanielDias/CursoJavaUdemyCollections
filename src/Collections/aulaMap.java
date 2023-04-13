package Collections;

import java.util.HashMap;
import java.util.Map;

public class aulaMap {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>();//O mapa usa um tipo de salvamento chave e valor
        usuarios.put(1, "Matheus");//Map usando key e valor (não tem o add)
        usuarios.put(1, "Jorge");//O put pode adicionar ou alterar por isso não usa o add (a chave não pode duplicar)
        usuarios.put(2, "Mario");
        usuarios.put(3, "João");
        usuarios.put(4, "Alex");

        System.out.println(usuarios.size());//diz o tamanho
        System.out.println(usuarios.isEmpty());//Vê se está vazia

        System.out.println(usuarios.keySet());//Mostra as chaves
        System.out.println(usuarios.values());//Mostra os valores
        System.out.println(usuarios.entrySet());//Mostra valor e chave

        System.out.println(usuarios.containsKey(2));//Procura se tem a chave
        System.out.println(usuarios.containsValue("João"));//Procura se tem o valor

        System.out.println(usuarios.get(3));//Recupera o valor por chave

        for (int chaves : usuarios.keySet()) {
            System.out.println(chaves);
        }
        for (String Usuarios: usuarios.values()){
            System.out.println(Usuarios);
        }
        for (Map.Entry<Integer,String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey()+"===> ");
            System.out.println(registro.getValue()); ;

        }
        System.out.println();
        usuarios.remove(1);//remove ou por chave ou chave e valor
        usuarios.remove(2,"Mario");

        for (Map.Entry<Integer,String> teste: usuarios.entrySet()){
            System.out.print(teste.getKey()+"===> ");
            System.out.println(teste.getValue()) ;

        }
    }
}

