package arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {

        // Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.

        int[][] M = criaMatriz(5, 7);

        imprimeMatriz(M);
    }

    public static int[][] criaMatriz(int line, int column){
        Random rand = new Random();
        int [][] M = new int[line][column];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++)
                M[i][j] = geraNumeroAleatorio(9);
        }

        return M;
    }

    public static void imprimeMatriz(int[][] M){
//        Traditional FOR LOOP.
//
//        for(int i = 0; i < M.length; i++){
//            for(int j = 0; j < M[i].length; j++)
//                System.out.print(M[i][j] + " ");
//            System.out.println();
//        }


//      Enhanced FOR LOOP suggest by IDE.
        for (int[] ints : M) {
            for (int i = 0; i < ints.length; i++)
                System.out.print(ints[i] + " ");
            System.out.println();
        }
    }
    public static int geraNumeroAleatorio(int upperbound) {
        Random rand = new Random();

        return rand.nextInt(upperbound);
    }
}
