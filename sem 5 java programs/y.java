import java.util.*;
public class y{
    public static void main(String[] args) {
        int temp = 1;
        int num = 5;
        while (num > 0) {
            num = num >> temp;
            temp++;
            System.out.print("Hai ");
        }
    }
}