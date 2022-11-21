import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int firsthalf = (n+1)/2 ;
        int secondhalf = firsthalf - 1 ;

        for(int i = 1 ; i<=firsthalf ; i++ )
        {
            for(int j = 1 ; j <= firsthalf - i ; j++)
            {
                System.out.print("\t");
            }
            for(int k = 1 ; k <= (2*i) - 1 ; k++ )
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        for(int i = secondhalf ; i >= 1 ; i-- ) 
        {
            for(int j = 1 ; j <= secondhalf - i + 1 ; j++)
            {
                System.out.print("\t");
            }
            for(int k = 1 ; k <= (2*i) - 1 ; k++ )
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
