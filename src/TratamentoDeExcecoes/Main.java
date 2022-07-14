package TratamentoDeExcecoes;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        int[] numerador = {10, 4, 7, 10};
        int[] denominador = {5, 2, 2, 0, 9};

//        int[] numerador = {10, 4, 8, 10, 18};
//        int[] denominador = {5, 2, 2, 2, 9};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new TrataExcecaoException("Divisao nao exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (TrataExcecaoException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
