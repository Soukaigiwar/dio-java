package sobrecargas;

public class Area {

    public static void area(double x) {

        System.out.println("A area do quadrado com " + x + "m de lado é: " + (x * x) + "metros quadrados.");
    }

    public static void area(double x, double y) {
        System.out.print("A area do retangulo com " + x + " x " + y + "m de lados é ");
        System.out.print(x * y);
        System.out.println("metros quadrados.");
    }

    public static void area(double X1, double X2, double h) {

        System.out.print("A area do trapezio com " + X1 + "m de base maior + ");
        System.out.print(X2 + "m de base menor, ");
        System.out.print(h + "m de altura é ");
        System.out.print(((X1 + X2) * h) / 2);
        System.out.println("metros quadrados.");

    }

    public static void area(float x) {

        System.out.print("A area do circulo com " + x + "m de raio é: ");
        System.out.println(String.format("%.1f", 3.14f * (x * x)) + "metros quadrados.");
    }
}
