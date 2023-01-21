import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        
        int d = getsum(b , n1 , n2);
        System.out.println(d);
    }

    public static int getsum(int b , int n1 , int n2){
         int ans = 0 ;
         int carry = 0 , value = 0 ,multiplier = 1 ;
         while(n1 > 0 || n2 > 0 || carry > 0){
            int digit1 = n1 % 10 ;
            int digit2 = n2 % 10 ;
            n1 = n1/10;
            n2 = n2/10;

            value = digit1 + digit2 + carry;
            carry = value / b ;
            value = value % b;

            ans += value * multiplier ;
            multiplier = multiplier * 10 ;
         }

         return ans ;
    }
}
