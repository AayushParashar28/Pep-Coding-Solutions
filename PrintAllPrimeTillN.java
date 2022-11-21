import java.util.Scanner;

public class PrintAllPrimeTillN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int low = s.nextInt();
        int high = s.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }

        }
    }
}
