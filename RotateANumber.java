import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        k = k % count;
        if (k < 0) {
            k = k + count;
        }
        int div = 1;
        int multi = 1;
        for (int i = 1; i <= count; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                multi = multi * 10;
            }
        }
        int quot = n / div;
        int rem = n % div;
        int r = rem * multi + quot;
        System.out.println(r);
    }
}
