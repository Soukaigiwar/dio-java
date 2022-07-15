package desafiodecodigo;

import java.util.*;

public class Desafio03 {

    /*
     * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
     * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
     * mostrando 4 casas decimais após a vírgula, conforme a fórmula:
     * */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Double x1 = input.nextDouble();
        Double y1 = input.nextDouble();
        Double x2 = input.nextDouble();
        Double y2 = input.nextDouble();

        Double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f", distancia);
        input.close();
    }
}