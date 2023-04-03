package Collections;

import java.util.HashSet;
import java.util.Set;

public class aulaStes {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add("Lucas");// String é String
        conjunto.add(true);//bollean -> Bollean
        conjunto.add(1.56);// double -> Double
        conjunto.add(50);//int -> Interger
        conjunto.add(1);

        System.out.println(conjunto.size());//fala o tamanho do set
        System.out.println(conjunto.remove(1.56));//remove um elemento do set
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains("Lucas"));//confer se tem o elemento no set

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        //mostra os conjuntos
        System.out.println(nums);
        System.out.println(conjunto);

        //união de 2 conjuntos
        conjunto.addAll(nums);
        System.out.println(conjunto);

        //interceção
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        //limpar
        conjunto.clear();
        System.out.println(conjunto);
    }
}
