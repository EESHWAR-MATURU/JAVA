import java.util.Scanner;

class Rahul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int steps = 0;

        while (N > 1) {
            N -= 1;
            steps++;
        }

        // Output the total number of steps taken
        System.out.println(steps);
    }
}
