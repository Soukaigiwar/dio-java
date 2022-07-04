package arrays;

import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {

        // Ordem Inversa: Faça um Programa que leia um vetor de
        // 5 números inteiro e mostre-os na ordem inversa.

        int[] meuVetor = new int[5];

        System.out.println("Digite 5 numeros para preencher um vetor: ");

        for(int i = 0; i < 5; i++){
            System.out.print("Posicao " + i + ": ");
            meuVetor[i] = lerNumero();
        }

        System.out.print("O vetor digitado foi: ");
        imprimeVetor(meuVetor);
        System.out.print("o vetor invertido e:  ");
        imprimeVetor(inverteVetor(meuVetor));
    }

    public static int lerNumero(){

        Scanner numeroInput = new Scanner(System.in);

        int numero = Integer.parseInt(numeroInput.nextLine());
        return numero;
    }

    public static int[] inverteVetor(int[] vetor){
        int[] invertido = new int[5];
        int j = 0;
        for(int i = vetor.length - 1; i >= 0; i--)
            invertido[i] = vetor[j++];
        return invertido;
    }

    public static void imprimeVetor(int[] vetor){
        for(int i = 0; i < 5; i++)
            System.out.print(vetor[i] + "  ");
        System.out.println();
    }
}
