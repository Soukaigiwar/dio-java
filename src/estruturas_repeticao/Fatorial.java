package estruturas_repeticao;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        // Fatorial: Faça um programa que calcule o fatorial
        // de um número inteiro fornecido pelo usuário.
        // Ex.: 5!=5.4.3.2.1=120

        int numero;

        System.out.print("Digite um numero para calcular o fatorial: ");
        numero = lerNumero();

        for(int i = numero; i > 1; i--){
            numero *= (i - 1);
        }
        System.out.println("O fatorial de " + numero + " e: ");
    }

    public static int lerNumero(){

        Scanner numeroInput = new Scanner(System.in);

        int numero = Integer.parseInt(numeroInput.nextLine());
        return numero;
    }
}
