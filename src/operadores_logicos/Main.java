package operadores_logicos;

public class Main {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int i1 = 10;
        int i2 = 48;
        char c1 = 48;
        char c2 = 49;
        float diametroRodaBicicleta = 14f;
        float diametroRodaRolema = 1f;
        boolean rodaBicicletaMaior = diametroRodaBicicleta >= diametroRodaRolema;
        boolean rodaBicicletaIgual = diametroRodaBicicleta == diametroRodaRolema;
        boolean caracterIgual = i2 == c1;


        System.out.println("teste 1: b1 && b2 = " + (b1 && b2)); // result: false
        System.out.println("teste 2: b1 && b3 = " + (b1 && b3)); // result: true
        System.out.println("teste 3: b1 || b3 = " + (b1 || b2)); // result: true
        System.out.println("teste 4: b1 || b3 = " + (b2 || b4)); // result: false
        System.out.println("teste 5: b1 ^ b2 = " + (b1 ^ b2)); // result: true
        System.out.println("teste 6: b1 ^ b3 = " + (b1 ^ b3)); // result: false
        System.out.println("teste 7: b2 ^ b4 = " + (b2 ^ b4)); // result: false
        System.out.println("teste 8: !b1 = " + (!b1)); // result: false
        System.out.println("teste 9: !b2 = " + (!b2)); // result: true
        System.out.println("teste 10: ((i1 + i2) > 50) && true = " + ((i1 + i2) > 50 && true)); // result: false
        System.out.println("teste 11: (!(c1 < c2)) ^ true = " + (!(c1 < c2) ^ true)); // result: true

        if(!((diametroRodaBicicleta >= diametroRodaRolema) && i1 == c1) && (diametroRodaBicicleta == diametroRodaRolema))
            System.out.println("resultado: false > não vai exibir essa mensagem.");
        else if (!((rodaBicicletaMaior) && caracterIgual) && (rodaBicicletaIgual))
            System.out.println("resultado: false > não vai exibir essa mensagem.");
        else
            System.out.println("resultado: false > essa vai exibir.");
    }
}
