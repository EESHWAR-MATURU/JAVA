import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x-coordinate of point 1:");
        double x1 = scanner.nextDouble();

        System.out.println("Enter the y-coordinate of point 1:");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the x-coordinate of point 2:");
        double x2 = scanner.nextDouble();

        System.out.println("Enter the y-coordinate of point 2:");
        double y2 = scanner.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double dist = Point.distance(p1, p2);
        System.out.println("Distance between p1 and p2: " + dist);

        scanner.close();
    }
}
