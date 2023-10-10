import java.util.Scanner;

public class checkArmstrong1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int temp = n ;
        int count = 0 ;

        while(temp != 0){
            count++;
            temp = temp/10;
        }
        
        int number = n ;
        int sumofpower = 0;

        while(n > 0){
            int rem = n % 10 ;
            sumofpower += Math.pow(rem , count);
            n = n / 10 ;
        }

        if(sumofpower == number){
            System.out.println("true");
         }else{
              System.out.println("false");
         }
    }
}