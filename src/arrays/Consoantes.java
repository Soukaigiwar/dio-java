package arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

    //Faça um Programa que leia um vetor de 6 caracteres,
    //e diga quantas consoantes foram lidas.
    //Imprima as consoantes.

        int numCaracteres = 6;
        int numConsoantes = lerString(numCaracteres);

        System.out.println("Entre esses caracteres, existem " + numConsoantes + " consoantes.");
    }

    public static int lerString(int numCaracteres){

        Scanner charInput = new Scanner(System.in);
        int counter = 0;

        System.out.println("Digite " + numCaracteres + " caracteres para testar quantas consoantes ha: ");

        for(int i = 0; i < numCaracteres; i++){
            System.out.print("Caracter " + i + ": ");
            char meuChar = charInput.nextLine().charAt(0);
            if (checarConsoante(meuChar))
                counter++;
        }

        return counter;
    }

    public static boolean checarConsoante(char meuChar){

        return meuChar != 'a' && meuChar != 'e' && meuChar != 'i' && meuChar != 'o' && meuChar != 'u';
    }
}
