import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int temp = 0 ;

        for(int i = 1 ; i <= n ; i++){
            temp = n % i ;
            if(temp == 0){
                System.out.print(i+ " ");
            }
        }
    }
}
