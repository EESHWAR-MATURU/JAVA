import Quad1.QuadEquation;
import Quad2.QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        // Create an object of QuadraticEquation class
        QuadraticEquation qe = new QuadraticEquation();

        // Pass the coefficients of the quadratic equation to calculate the roots
        qe.calculateRoots(1, -5, 6);
    }
}
