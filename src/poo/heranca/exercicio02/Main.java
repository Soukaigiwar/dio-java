package poo.heranca.exercicio02;

public class Main {

    Funcionario Sergio = new Vendedor();
    Funcionario Henrique = new Faxineiro();
    Gerente Antonio = (Gerente) new Funcionario();
}
