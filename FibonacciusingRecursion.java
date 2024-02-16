
import java.util.*;
public class FibonacciusingRecursion {

    public static void fibo(int n){
       int start = 0;
       int end = 1;
       for(int i = 0 ; i < n ; i++){
        System.out.print(start + " ");
        int sum = start + end ;
        start = end ;
        end = sum ;
       }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fibo( n );

    }
}
