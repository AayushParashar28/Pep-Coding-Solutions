import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int d = getDifference( b , n1 , n2);
        System.out.println(d);
    }

    public static int getDifference(int b , int n1 , int n2){
        int result = 0 ;
        int carry = 0 , value = 0 , multiplier = 1 ;
        while( n2 > 0 )
        {
            int digit1 = n1 % 10 ;
            int digit2 = n2 % 10 ;
            n1 = n1 /10;
            n2 = n2/10;
            
            digit2 = digit2 + carry ;
            if(digit2 >= digit1){
                carry = 0 ;
                value = digit2 - digit1 ;
            }
            else{
                carry = -1 ;
                value = digit2 + b - digit1 ;
            }
            result = result + value * multiplier ;
            multiplier = multiplier * 10;
        }
        return result ;
    }
}
