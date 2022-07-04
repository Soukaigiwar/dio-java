package estruturas_repeticao;

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {
        // Maior e Média: Faça um programa que leia 5 números e
        // informe o maior número e a média desses números.

        int i = 0;
        int qtdNumero = 3;
        float numero;
        float maior = 0f;
        float media = 0f;

        do {
            System.out.print("Digite o numero " + (++i) + ": ");
            numero = lerNumero();
            media += numero;

            if (numero > maior)
                maior = numero;
        } while (i < qtdNumero);

        System.out.println("O maior numero informado foi: " + maior);
        System.out.println("E a media deles foi: " + (media / qtdNumero));
    }

    public static float lerNumero(){

        Scanner numeroInput = new Scanner(System.in);

        float numero = Float.parseFloat(numeroInput.nextLine());
        return numero;
    }
}
