package estruturas_repeticao;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {

        // Par e Ímpar: Faça um programa que peça N números inteiros.
        // Calcule e mostre a quantidade de números pares e a
        // quantidade de números impares.

        int i = 1;
        int n;
        int par = 0;
        int impar = 0;

        System.out.print("Digite quantos numeros vai precisar digitar: ");
        n = lerNumero();
        do {
            System.out.print("digite o " + i + " de " + n + ":");
            int numero = lerNumero();

            if(numero % 2 == 0)
                par++;
            else
                impar++;
        } while (i++ < n);

        System.out.println("\nPares: " + par);
        System.out.println("Impares: " + impar);
    }

    public static int lerNumero(){

        Scanner numeroInput = new Scanner(System.in);

        int numero = Integer.parseInt(numeroInput.nextLine());
        return numero;
    }
}
