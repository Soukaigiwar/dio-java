package Collections.Set;

import java.util.*;

public class Exercicio1 {

    /*
    Crie uma conjunto contendo as cores do arco-íris e:
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
     */

    public static void main(String[] args) {

        Set<String> coresArcoIris = new HashSet<>();

        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");

        printList(coresArcoIris);
        printListSize(coresArcoIris);
        printListOrdered(coresArcoIris);
        printListReverse(coresArcoIris);
        printVColor(coresArcoIris);
        removeOtherThanVColor(coresArcoIris);
        System.out.println("\nLimpando o conjunto... ");
        coresArcoIris.clear();
        System.out.println("\nO conjunto esta vazio? " + coresArcoIris.isEmpty());
    }

    private static void printListSize(Set<String> cores) {
        System.out.println("\nA lista de cores do arco-iris tem: " + cores.size() + " elementos.");
    }

    public static void printList(Set<String> cores) {
        System.out.println("\nLista de todas as cores o arco-iris: ");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }

    public static void printListOrdered(Set<String> cores) {
        System.out.println("\nLista de cores em ordem alfabetica: ");
        Set<String> coresArcoIris = new TreeSet<>(cores);
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
    }

    public static void printListReverse(Set<String> cores) {
        System.out.println("\nLista de cores na ordem inversa: ");
        List<String> coresReversa = new ArrayList<>();

        for (String cor : cores)
            coresReversa.add(cor);

        Collections.reverse(coresReversa);

        for (String cor : coresReversa)
            System.out.println(cor);
    }

    public static void printVColor(Set<String> cores) {
        System.out.println("\nLista de cores que comecam com a letra 'V': ");

        for (String cor: cores) {
            if (cor.startsWith("v")) System.out.println(cor);
        }
    }

    public static void removeOtherThanVColor(Set<String> cores) {
        System.out.println("\nRemovendo todas as cores que nao comecam com a letra 'v'... ");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
    }
}
