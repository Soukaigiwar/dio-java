package estruturas_repeticao;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        // Tabuada: Desenvolva um gerador de tabuada,
        // capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        // O usuário deve informar de qual numero ele deseja ver a tabuada.
        // A saída deve ser conforme o exemplo abaixo:

        int tabuadaDoNumero;

        System.out.print("Qual numero deseja ver a tabuada (entre 1 e 10): ");
        tabuadaDoNumero = lerNumero();
        for(int i = 1; i <=10; i++){
            System.out.println(tabuadaDoNumero + " X " + i + " = " + (tabuadaDoNumero * i));
        }
    }

    public static int lerNumero(){

        Scanner numeroInput = new Scanner(System.in);

        int numero = Integer.parseInt(numeroInput.nextLine());
        return numero;
    }
}
