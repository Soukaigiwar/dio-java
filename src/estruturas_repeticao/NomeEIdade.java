package estruturas_repeticao;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class NomeEIdade {

    public static void main(String[] args) {
        // Nome e Idade: Faça um programa que leia conjuntos de dois valores,
        // o primeiro representando o nome do aluno e o segundo representando
        // a sua idade. (Pare o programa inserindo o valor 0 no campo nome)

        String nome = "";
        int idade = 0;

        while (!nome.equals("0")){
            System.out.print("Insira o nome do aluno: ");
            nome = lerNome();
            if(nome.equals("0"))
                break;
            System.out.print("Insira a idade do aluno: ");
            idade = lerIdade();
            System.out.println("Ola " + nome + " que tem " + idade + " anos.");
        }

        System.out.println("Esta tudo terminado entre nos!!!");
    }

    public static String lerNome(){

        Scanner nomeInput = new Scanner(System.in);

        String nome = nomeInput.nextLine();
        return nome;
    }

    public static int lerIdade(){

        Scanner idadeInput = new Scanner(System.in);

        int idade = Integer.parseInt(idadeInput.nextLine());
        return idade;
    }
}
