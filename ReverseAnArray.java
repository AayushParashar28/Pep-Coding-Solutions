import java.util.*;

public class ReverseAnArray {

    public static void reverse(int n , int[] nums){
        int[] newarr = new int[n];
        int temp ;
        for(int i = 0 ; i < n ; i++){
            newarr[i] = nums[n - 1 - i];
            temp = newarr[i] ;
            System.out.print(temp + " ");
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }
        reverse(n , arr);
    }
}
