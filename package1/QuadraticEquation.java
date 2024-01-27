package Quad2;

import Quad1.QuadEquation;

public class QuadraticEquation implements QuadEquation {

    public void calculateRoots(double a, double b, double c) {
        double root1, root2;
        double determinant = b * b - 4 * a * c;

        // Check if determinant is greater than 0
        if (determinant > 0) {
            // Two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("Root1: %.2f and Root2: %.2f", root1, root2);
        }
        // Check if determinant is equal to 0
        else if (determinant == 0) {
            // Two real and equal roots
            root1 = root2 = -b / (2 * a);

            System.out.format("Root1 = Root2 = %.2f;", root1);
        }
        // If determinant is less than zero
        else {
            // Complex roots
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);

            System.out.format("Root1: %.2f + %.2fi and Root2: %.2f - %.2fi", real, imaginary, real, imaginary);
        }
    }
}
