import java.util.Scanner;

public class DecimaltoAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int ans = 0;
        int multiplier = 1 ; 
        while(n>0){
        int remainder = n % b;
        n = n / b ;

        ans = ans + remainder * multiplier ;
        multiplier *= 10 ;
        }
        //returning ans
        return ans;
    }

}
