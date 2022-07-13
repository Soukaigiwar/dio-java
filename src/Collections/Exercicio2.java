package Collections;

import java.util.*;

public class Exercicio2 {

    /*
    Utilizando listas, faça um programa que faça 5 perguntas para uma
    pessoa sobre um crime. As perguntas são:

    "Telefonou para a vítima?"
    "Esteve no local do crime?"
    "Mora perto da vítima?"
    "Devia para a vítima?"
    "Já trabalhou com a vítima?"

    Se a pessoa responder positivamente a 2 questões ela deve ser
    classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
    "Assassina". Caso contrário, ela será classificado como "Inocente".
    */

    public static void main(String[] args) {

        List<String> perguntas = listaDePerguntas();

        System.out.println("Lista de Interrogatorio (Responda com 's' ou 'n')\n");
        List<String> respostas = listaDeRespostas(perguntas);


        System.out.print("\nSegundo a analise realizada, voce eh considerado(a): ");
        System.out.println(evalRespostas(respostas));
        System.out.println(
                        "\nEra so pra saber mesmo. " +
                        "E some da minha frente antes que eu mando te prender!!!"
        );
    }

    public static List<String> listaDePerguntas() {
        List<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vitima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vitima?");
        perguntas.add("Ja trabalhou com a vitima?");

        return perguntas;
    }

    public static List<String> listaDeRespostas(List perguntas) {

        List<String> respostas = new ArrayList<>();
        Scanner respostaInput = new Scanner(System.in);
        for (Object pergunta : perguntas) {
            System.out.print(pergunta + " ");
            respostas.add(respostaInput.next());
        }

        return respostas;
    }

    public static String evalRespostas(List respostas) {
        int sim = 0;

        for (String resposta : (Iterable<String>) respostas)
            if (resposta.contains("s")) sim++;

        return switch (sim) {
            case 1, 2 -> "Suspeita";
            case 3, 4 -> "Cumplice";
            case 5 -> "Assassina";
            default -> "Inocente";
        };
    }
}
