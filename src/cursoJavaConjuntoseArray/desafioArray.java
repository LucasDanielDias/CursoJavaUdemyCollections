package cursoJavaConjuntoseArray;

import java.util.Scanner;

public class desafioArray {
    public static void main(String[] args) {

        //declaração das variaveis globais
        Double MediaSala = 0.0;
        int y =0;
        int a = 0;
        int b = 0;
        Scanner ler = new Scanner(System.in);
        Double soma = 0.0;

        //definição de a e b, alem dos arrays
        System.out.println("Quantos alunos tem?");
        b = ler.nextInt();
        System.out.println("Quantas notas você quer salvar?");
        a = ler.nextInt();
        Double[] notas = new Double[a];
        Integer[] alunos = new Integer[b];

        //start nos for´s
        for (int p = 0; p < alunos.length; p++) {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a " + (i + 1) + "° nota do aluno "+ (p+1));
                notas[i] = (double) ler.nextDouble();
            }

            Double total = 0.0;
            for (Double nota : notas) {
                total += nota;
            }

            Double mediaA = total / a;
            Double[] media = new Double[b];
            System.out.println("A media do aluno foi "+mediaA);
            media[y] = mediaA;
            y++;
            MediaSala += mediaA;
        }
        System.out.println("A media da sala foi "+MediaSala/b);
        }
    }

