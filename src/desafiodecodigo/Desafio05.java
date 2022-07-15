package desafiodecodigo;

import java.io.IOException;
import java.util.Scanner;

public class Desafio05 {

    //complete o código para que ele funcione corretamente

    public static void main(String[] args) throws IOException {
        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner leitor = new Scanner(System.in);

        while (true) {
            int N = leitor.nextInt();
            int M = leitor.nextInt();
            int troco = M - N;
            int[] notas = {2, 5, 10, 20, 50, 100};
            boolean possivel = false;

            System.out.println(troco);

            if (N == 0 && M == 0) break;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (troco - notas[j] == notas[i]) {
                        possivel = true;
                        break;
                    }
                }
            }

            if (possivel) System.out.println("possible");
            else System.out.println("impossible");
        }
    }
}