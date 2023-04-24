import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        arr[0] = 33 ;
        arr[1] = 45 ;
        arr[2] = 46 ;
        arr[3] = 58 ;
        arr[4] = 67 ;
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
