import java.util.Scanner;

public class CheckArmstrong {

    public static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean f = checkPrime(n);
        if(n!=1 && f == true ){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

        
    }
}
