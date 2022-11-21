import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int node = 0;
        while(n!=0)
        {
            int m = n%10;
            System.out.println(m);
            node++;
            n=n/10;
        }
        
    }
}
