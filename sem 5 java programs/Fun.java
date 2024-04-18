public class Fun {
    public static void main(String[] args) {
        int result = fun(5, 2);
        System.out.println(result);
    }

    public static int fun(int x, int y) {
        if (x > 1) {
            return fun(x - 1, y + 3);
        }
        System.out.println(y);
        return y;
    }
}
