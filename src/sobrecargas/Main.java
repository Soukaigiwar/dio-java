package sobrecargas;

public class Main {

    public static void main(String[] args) {
        int square = 3;
        int rectangleX = 4;
        int rectangleY = 2;
        int trapezeX1 = 10;
        int trapezeX2 = 4;
        int trapezeH = 5;

        System.out.println("A area do quadrado com " + square + "m de lado é: " + Area.area(3) + "metros quadrados.");

        System.out.print("A area do retangulo com " + rectangleX + " x " + rectangleY + "m de lados é ");
        System.out.print(Area.area(rectangleX, rectangleY));
        System.out.println("metros quadrados.");

        System.out.print("A area do trapezio com " + trapezeX1 + "m de base maior + ");
        System.out.print(trapezeX2 + "m de base menor, ");
        System.out.print(trapezeH + "m de altura é ");
        System.out.print(Area.area(trapezeX1, trapezeX2, trapezeH));
        System.out.println("metros quadrados.");
    }
}
