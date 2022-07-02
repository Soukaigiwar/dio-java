package sobrecargas;

public class Main {

    public static void main(String[] args) {
        double square = 3d;
        double rectangleX = 4d;
        double rectangleY = 2d;
        double trapezeX1 = 10d;
        double trapezeX2 = 4d;
        double trapezeH = 5d;
        float circle = 6f;

        System.out.println("A area do quadrado com " + square + "m de lado é: " + Area.area(square) + "metros quadrados.");

        System.out.print("A area do retangulo com " + rectangleX + " x " + rectangleY + "m de lados é ");
        System.out.print(Area.area(rectangleX, rectangleY));
        System.out.println("metros quadrados.");

        System.out.print("A area do trapezio com " + trapezeX1 + "m de base maior + ");
        System.out.print(trapezeX2 + "m de base menor, ");
        System.out.print(trapezeH + "m de altura é ");
        System.out.print(Area.area(trapezeX1, trapezeX2, trapezeH));
        System.out.println("metros quadrados.");

        System.out.print("A area do circulo com " + circle + "m de raio é: ");
        System.out.println(String.format("%.1f", Area.area(circle)) + "metros quadrados.");
    }
}
