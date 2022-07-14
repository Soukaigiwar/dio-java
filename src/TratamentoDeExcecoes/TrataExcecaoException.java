package TratamentoDeExcecoes;

public class TrataExcecaoException extends Exception {

    int numerador;
    int denominador;

    public TrataExcecaoException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
