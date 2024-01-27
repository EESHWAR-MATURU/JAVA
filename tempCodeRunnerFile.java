import java.util.Scanner;

interface Quad1 {
    public void calculateRoots(double a, double b, double c);
}

class Quad2 implements Quad1 {
    public void calculateRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The quadratic equation has no real roots.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The quadratic equation has a single real root: " + root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The quadratic equation has two real roots: " + root1 + " and " + root2);
        }
    }
}

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a, b, and c of the quadratic equation: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        Quad1 quad = new Quad2();
        quad.calculateRoots(a, b, c);
    }
}
