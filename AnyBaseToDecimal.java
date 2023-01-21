import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int ans = 0 , multiplier = 0;
        
        while (n > 0) {
              int remainder = n % 10 ;
              n = n/10 ;
              ans += remainder * Math.pow(b,multiplier);
              multiplier++;
        }

        return ans;
    }
}
