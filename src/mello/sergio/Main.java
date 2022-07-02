package mello.sergio;

public class Main {

    public static void main(String[] args) {

        System.out.println("++++++++++++++++ CALCULATOR +++++++++++++++++");

        double numberX = 34;
        double numberY = 23;

        System.out.println("Soma: " + String.format("%.2f", Calculator.sum(numberX, numberY)));
        System.out.println("Subtract: " + String.format("%.2f", Calculator.subtraction(numberX, numberY)));
        System.out.println("Multiplication: " + String.format("%.2f", Calculator.multiplication(numberX, numberY)));
        System.out.println("Division: " + String.format("%.2f", Calculator.division(numberX, numberY)) + "\n");

        System.out.println("++++++++++++++++ LOAN ++++++++++++++++++++++");

        double value = 1000d;
        int parcel = 3;

        String loan = String.format("%.2f", Loan.loanCalculator(value, parcel));

        System.out.println("O empréstimo de R$ " + value + " vai sair por: ");
        System.out.println(parcel + " parcelas de r$ " + loan + "\n");

        System.out.println("++++++++++++++++ GREETINGS +++++++++++++++++");

        System.out.println("Olá, " + Greetings.getGreetings(19)); // output: Olá, boa noite!!!
    }
}
