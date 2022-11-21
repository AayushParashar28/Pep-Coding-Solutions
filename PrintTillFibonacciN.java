import java.util.Scanner;

public class PrintTillFibonacciN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int start = 0 ;
        int next = 1 ;
        //System.out.println(start);
        //System.out.println(next);
        for(int i = 0 ; i<=n ; i++)
        {
            System.out.println(start);
            int sum = start + next ;
            start = next ;
            next = sum ;
        }
    }
}
