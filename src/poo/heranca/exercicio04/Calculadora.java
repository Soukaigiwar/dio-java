package poo.heranca.exercicio04;

public class Calculadora implements OperacaoMatematica {

    @Override
    public boolean soma (double numeroUm, double numeroDois) {

        System.out.println("Soma: " + (numeroUm + numeroDois));

        return false;
    }

    @Override
    public boolean subtracao (double numeroUm, double numeroDois) {

        System.out.println("Subtracao: " + (numeroUm - numeroDois));

        return false;
    }

    @Override
    public boolean divisao (double numeroUm, double numeroDois) {

        System.out.println("Divisao: " + (numeroUm / numeroDois));

        return false;
    }

    @Override
    public boolean multiplicacao (double numeroUm, double numeroDois) {

        System.out.println("Multiplicacao: " + (numeroUm * numeroDois));

        return false;
    }


}
