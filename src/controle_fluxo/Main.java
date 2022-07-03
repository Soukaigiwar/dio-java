package controle_fluxo;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        int mes = 12;
        int opcao = 6;
        String diaSemana = "sabado feira";

        System.out.println(exemploIf(mes));
        exemploFerias(mes);
        exemploSwitch1(diaSemana);
        exemploSwitch2(opcao);
    }

    public static String exemploIf(int mes){
        String mensagem = "";

        if(mes < 1)
            mensagem = "Numero Inválido.";
        if(mes == 1)
            mensagem = "Janeiro";
        if(mes == 2)
            mensagem = "Fevereiro";
        if(mes == 3)
            mensagem = "marco";
        if(mes == 4)
            mensagem = "Abril";
        if(mes == 5)
            mensagem = "Maio";
        if(mes == 6)
            mensagem = "Junho";
        if(mes == 7)
            mensagem = "Julho";
        if(mes == 8)
            mensagem = "Agosto";
        if(mes == 9)
            mensagem = "Setembro";
        if(mes == 10)
            mensagem = "Outubro";
        if(mes == 11)
            mensagem = "Novembro";
        if(mes == 12)
            mensagem = "Dezembro";
        if(mes > 12)
            mensagem = "Numero inválido.";

        if(mes == 1 || mes == 7 || mes == 12)
            mensagem += ", Voce esta de ferias!!!";

        return mensagem;
    }

    public static void exemploFerias(int mes){

        String mensagem = "Ferias";

        switch (mes){
            case 1:
                System.out.println(mensagem);
                break;
            case 7:
                System.out.println(mensagem);
                break;
            case 12:
                System.out.println(mensagem);
                break;
            default:
                System.out.println("Nada de Ferias por enquanto.");
        }
    }
    public static void exemploSwitch1(String diaSemana){

        switch (diaSemana) {
            case "domingo":
                System.out.println("1");
                break;
            case "segunda":
                System.out.println("2");
                break;
            case "terca":
                System.out.println("3");
                break;
            case "quarta":
                System.out.println("4");
                break;
            case "quinta":
                System.out.println("5");
                break;
            case "sexta":
                System.out.println("6");
                break;
            case "sabado":
                System.out.println("7");
                break;
            default:
                System.out.println("Dia da semana invalido.");
        }


    }

    public static void exemploSwitch2(int opcao){

        switch (opcao){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            default:
                System.out.println("Valor indefinido.");
        }
    }
}
