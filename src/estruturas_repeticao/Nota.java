package estruturas_repeticao;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {

        // Nota: Faça um programa que peça uma nota, entre zero e dez.
        // Mostre uma mensagem caso o valor seja inválido e continue pedindo
        // até que o usuário informe um valor válido.

        int nota = -1;

        while (nota < 0 || nota > 10){
            System.out.print("Insira a nota do alulo de 0 a 10: ");
            nota = lerNota();
            if(nota >= 0 && nota <= 10)
                break;
            System.out.println("A nota informada foi: " + nota + ". Escreva direito vai. Tente de novo.");
        }

        System.out.println("A nota informada foi: " + nota + ". Nao sei se devo dizer parabens.");
    }

    public static int lerNota(){

        Scanner notaInput = new Scanner(System.in);

        int nota = Integer.parseInt(notaInput.nextLine());
        return nota;
    }
}
