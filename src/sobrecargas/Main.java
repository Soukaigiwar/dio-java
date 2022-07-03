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

        System.out.println("Projeto Sobrecargas");
        Area.area(square);
        Area.area(rectangleX, rectangleY);
        Area.area(trapezeX1, trapezeX2, trapezeH);
        Area.area(circle);
    }
}
