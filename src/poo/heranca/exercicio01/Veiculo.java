package poo.heranca.exercicio01;

public class Veiculo {

    String tipo;

    Veiculo(){

    }

    Veiculo(String tipo){
        this.tipo = tipo;
    }

    void setTipo(String tipo) { this.tipo = tipo; }

    String getTipo() { return tipo; }
}
