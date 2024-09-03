import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();  
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int D = 100 - N;  
            
            boolean canForm = false;
            for (int x = 0; x <= D / 3; x++) {
                if ((D - 3 * x) % 7 == 0) {
                    canForm = true;
                    break;
}
            }
            
            System.out.println(canForm ? 1 : 0);
        }
        
        scanner.close();
    }
}