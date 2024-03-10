public class Fibonacci {
    private int n;
    private int[] fib;

    public Fibonacci(int n) {
        this.n = n;
        fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    public void printSeries() {
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fibonacci fibSeries = new Fibonacci(10);
        fibSeries.printSeries();
    }
}
