import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);

    }

    public static int getProduct(int b, int n1, int n2) {
        int ans = 0;
        int p = 1;

        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int sprd = getProductWithASingleDigit(b, n1, d2);
            ans = getsum(b, ans, sprd * p);
            p = p * 10;
        }

        return ans;
    }

    public static int getProductWithASingleDigit(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p = 1;

        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + c;

            c = d / b;
            d = d % b;

            rv = rv + d * p;
            p = p * 10;
        }

        return rv;
    }

    public static int getsum(int b, int n1, int n2) {
        int ans = 0;
        int carry = 0, value = 0, multiplier = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            value = digit1 + digit2 + carry;
            carry = value / b;
            value = value % b;

            ans += value * multiplier;
            multiplier = multiplier * 10;
        }

        return ans;
    }
}
