import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }

        if (count == 2) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
