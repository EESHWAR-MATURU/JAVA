public class Array {
    public static void main(String[] args) {
        int a = 4, b = 5, count = 0, count1 = 0;
        while (a <= 4) {
            b = 2;
            while (b <= 5) {
                b = b + 2;
                count1 = count1 + 1;
            }
            a = a + 1;
            count = count1 + 1;
        }
        System.out.println("count: " + count + ", count1: " + count1);
    }
}
