﻿package poo.exercicio04;

 // Crie a classe Carro

public class Carro {

    String cor;
    String modelo;
    Integer capacidadeDoTanque;

    Carro(){

    }

    Carro(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    Carro(String cor, String modelo, Integer capacidadeDoTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
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

    void setCapacidadeDoTanque(Integer capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    Integer getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    Double calcularTotal(Double precoGasolina){
        return capacidadeDoTanque * precoGasolina;
    }
}
