package poo.heranca.exercicio01;

public class Moto extends Veiculo {

    String cor;
    String modelo;

    Moto(){

    }

    Moto(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }
}
