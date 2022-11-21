import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int count = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
