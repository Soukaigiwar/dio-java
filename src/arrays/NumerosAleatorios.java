package arrays;

import java.util.Random;


public class NumerosAleatorios {
    public static void main(String[] args) {

    // Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
    // Ao final mostre os números e seus sucessores.

        int[] meuVetor = new int[20];

        for (int i = 0; i < meuVetor.length; i++)
            meuVetor[i] = geraNumeroAleatorio(100);

        System.out.println("Os numeros sorteados e seus sucessores sao: ");

        for (int numero : meuVetor)
            System.out.println(numero + " e " + (numero + 1));
    }

    public static int geraNumeroAleatorio(int upperbound) {
        Random rand = new Random();

        return rand.nextInt(upperbound);
    }
}
