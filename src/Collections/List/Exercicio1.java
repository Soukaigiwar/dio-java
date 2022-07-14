package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

//    Faça um programa que receba a temperatura média dos 6
//    primeiros meses do ano e armazene-as em uma lista.
//
//    Após isto, calcule a média semestral das temperaturas e
//    mostre todas as temperaturas acima desta média, e em que
//    mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).

    public static void main(String[] args) {

        List<Double> temperaturaSemestre = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho"};

        temperaturaSemestre = lerTemperatura(meses);
        System.out.println();

        Double media = mediaTemperatura(temperaturaSemestre);
        System.out.println(
            "\nA media da temperatura no periodo foi de: " +
                    String.format("%.2f", media) + " graus celsius."
        );

        System.out.println("\nFicaram acima da media nos meses de: ");
        Iterator<Double> temperaturaMensal = temperaturaSemestre.iterator();
        while(temperaturaMensal.hasNext()) {
            Double acima = temperaturaMensal.next();
            if (acima > media) {
                System.out.println(meses[temperaturaSemestre.indexOf(acima)] +
                        " com a temperatura de " + temperaturaSemestre.get(temperaturaSemestre.indexOf(acima)) +
                        " graus celsius.");
            }
        }

        /*
        ## enhanced For ##
        for (Double acima : temperaturaSemestre) {
            if (acima > media) {
                System.out.println(meses[temperaturaSemestre.indexOf(acima)] +
                        " com a temperatura de " + temperaturaSemestre.get(temperaturaSemestre.indexOf(acima)) +
                        " graus celsius.");
            }
        }
        */

    }

    public static List lerTemperatura(String[] meses){

        Scanner temperaturaInput = new Scanner(System.in);
        List<Double> temperaturaMensal = new ArrayList();

        for (String mes : meses ) {
            System.out.print("Digite a temperatura do mes de " + mes + ": ");
            temperaturaMensal.add(temperaturaInput.nextDouble());
        }

        return temperaturaMensal;
    }

    public static Double mediaTemperatura(List listaTemperatura) {

        Double soma = somaTemperatura(listaTemperatura);

        return soma / listaTemperatura.size();
    }

    public static Double somaTemperatura(List listaTemperatura) {

        Double soma;
        Double next;

        Iterator<Double> iterator = listaTemperatura.iterator();
        for(soma = 0.0; iterator.hasNext(); soma += next) {
            next = iterator.next();
        }
        return soma;
    }
}
