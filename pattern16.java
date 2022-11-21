import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int st = 1;
        int sp = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(value + "\t");
                value++;
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                value--;
            }
            for (int j = 1; j <= st; j++) {
                value--;
                System.out.print(value + "\t");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}
