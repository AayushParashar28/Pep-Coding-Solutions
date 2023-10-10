import java.util.*;

public class OnetoNwithoutloop {

    static int currentIndex = 1 ;
    public static void print( int n , int[] arr){
        
        if(currentIndex == n){
            return;
        }

        arr[currentIndex] = currentIndex + 1 ;
        System.out.print(currentIndex);
        currentIndex++;
        print(n,arr);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        print(n, arr);
    }
}
