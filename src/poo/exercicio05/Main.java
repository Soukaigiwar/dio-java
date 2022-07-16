package poo.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String cor = "Vermelho";
        String modelo = "Conversivel";
        int capacidadeDoTanque = 45;
        double precoGasolina;
        Carro carro = new Carro(cor, modelo, capacidadeDoTanque);

        do {
            System.out.println("Informe o preco da gasolina: ");
            precoGasolina = input.nextDouble();
        } while (precoGasolina <= 0d);

        System.out.println("Vai custar R$" +
                carro.calcularTotal(precoGasolina) +
                " para encher um tanque desse carro " +
                carro.getCor() + " " + carro.getModelo() + "."
                );
    }
}
