package ss5_polymorphism;

public class Overload {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20, 30));
    }
}
