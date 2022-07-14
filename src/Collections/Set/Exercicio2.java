package Collections.Set;

import java.util.*;

public class Exercicio2 {

    /*
    Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
    Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    a) Ordem de inserção;
    b) Ordem natural(nome);
    c) IDE;
    d) Ano de criação e nome;
    e) Nome, ano de criação e IDE;
    Ao final, exiba as linguagens no console, um abaixo da outra.
    */

    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();

        minhasLinguagensFavoritas.add(new LinguagemFavorita("C", 1972, "VSCode"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("PHP", 1994, "VSCode"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "IntelliJ IDEA"));

        printList(minhasLinguagensFavoritas);
        printOrderByNameList(minhasLinguagensFavoritas);
    }

    public static void printList(Set<LinguagemFavorita> linguagemFavorita){
        System.out.println("\nLista de por ordem de insercao: ");
        for (LinguagemFavorita lf : linguagemFavorita) {
            System.out.println(lf);
        }
    }

    public static void printOrderByNameList(Set<LinguagemFavorita> linguagemFavorita) {
        System.out.println("\nLista de por ordem de Nome: ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas = (Set<LinguagemFavorita>) new ComparatorIde<LinguagemFavorita>();
        for (LinguagemFavorita lf : linguagemFavorita) System.out.println(lf);
//        printList(minhasLinguagensFavoritas);
    }

    static class LinguagemFavorita implements Comparable<LinguagemFavorita> {
        public String nome;
        public Integer anoDeCriacao;
        public String ide;

        public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
            this.nome = nome;
            this.anoDeCriacao = anoDeCriacao;
            this.ide = ide;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", anoDeCriacao=" + anoDeCriacao +
                    ", ide='" + ide + '\'' +
                    '}';
        }

        @Override
        public int compareTo(LinguagemFavorita linguagemFavorita) {
            return this.nome.compareTo(linguagemFavorita.nome);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LinguagemFavorita that = (LinguagemFavorita) o;
            return nome.equals(that.nome);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome);
        }
    }

    static class ComparatorIde implements Comparator<LinguagemFavorita> {

        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            return lf1.ide.compareToIgnoreCase(lf2.ide);
        }
    }

    class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
            if (anoDeCriacao != 0) return anoDeCriacao;
            return lf1.nome.compareToIgnoreCase(lf2.nome);
        }
    }

    class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

        @Override
        public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
            int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
            int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
            if (nome != 0) return nome;
            if (anoDeCriacao != 0) return anoDeCriacao;
            return lf1.ide.compareToIgnoreCase(lf2.ide);
        }
    }
}
