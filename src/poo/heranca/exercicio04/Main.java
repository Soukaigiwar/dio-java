package poo.heranca.exercicio04;

public class Main extends Calculadora{

    public static void main(String[] args) {

        Calculadora minhaCalculadora = new Calculadora();

        System.out.println(minhaCalculadora.soma(35, 56) + "\n");
        System.out.println(minhaCalculadora.subtracao(35, 56) + "\n");
        System.out.println(minhaCalculadora.divisao(35, 56) + "\n");
        System.out.println(minhaCalculadora.multiplicacao(35, 56) + "\n");

    }
}
