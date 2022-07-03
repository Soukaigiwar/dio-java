package retornos;

public class Area {

    public static double area(double x) {

        return x * x;
    }

    public static double area(double x, double y) {

        return x * y;
    }

    public static double area(double X1, double X2, double h) {

        return ((X1 + X2) * h) / 2;
    }

    public static double area(float x) {

        return 3.14f * (x * x);
    }
}
