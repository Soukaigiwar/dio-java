package operadores_relacionais;

public class Main {

    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 100;
        short sh1 = 1000;
        short sh2 = 2000;
        int i1 = 12;
        int i2 = 13;
        long l1 = 999999L;
        long l2 = 999999L;
        float f1 = 21.0f;
        float f2 = 21.0f;
        double d1 = 42.0d;
        double d2 = 21.0d;
        char c1 = 48;
        char c2 = 65;
        boolean bool1 = true;
        boolean bool2 = true;
        String s1 = "Sergio";
        String s2 = "Mello";

        System.out.println("teste 1: b1 > b2 = " + (b1 > b2)); // result: true
        System.out.println("teste 2: sh2 != sh2 = " + (sh1 > sh2)); // result: false
        System.out.println("teste 3: i1 < i2 = " + (i1 < i2)); // result: true
        System.out.println("teste 4: l1 == l2 = " + (l1 == l2)); // result: true
        System.out.println("teste 5: f1 >= f2 = " + (f1 >= f2)); // result: true
        System.out.println("teste 6: d1 <= d2 = " + (d1 <= d2)); // result: false
        System.out.println("teste 7: c1 < c2 = " + (c1 < c2)); // result: true
        System.out.println("teste 8: bool1 != bool2 = " + (bool1 != bool2)); // result: false
        System.out.println("teste 9: s1 == s2 = " + (s1 == s2)); // result: false
    }
}
