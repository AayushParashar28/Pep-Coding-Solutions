import java.util.Scanner;

public class CountDigitInANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;
        while (n != 0) {
            n = n / 10;
            sum++;
        }
        System.out.println(sum);
    }
}
