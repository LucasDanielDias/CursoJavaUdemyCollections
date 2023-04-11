package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class aluaFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.offer("Nada");
        fila.offer("OI");
        fila.offer("Matheus");
        fila.offer("pedro");

        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

    }
}
