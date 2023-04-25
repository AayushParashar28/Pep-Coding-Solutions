import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n] ;

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int d = s.nextInt() ;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==d){
            System.out.println(i);
            return ;
           }
        }
        System.out.println(-1);
    }
}
