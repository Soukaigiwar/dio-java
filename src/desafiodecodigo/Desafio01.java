package desafiodecodigo;

import java.util.*;

public class Desafio01 {

    //complete o código para que ele funcione corretamente

    public static void main(String[] args) {

        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner scan = new Scanner(System.in);

        int N= scan.nextInt();
        String string = scan.nextLine();

        //quebra string em várias substrings a partir de um caracter
        String[] s = string.split(" ");

        Integer[] idade = new Integer[N];

        for (int i = 0; i < N; i++)
        {
            idade[i] = scan.nextInt();
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++)
        {
            if (idade[i] < 18)
            {
                System.out.println(idade[i]);
            }
        }
    }
}