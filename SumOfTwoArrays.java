import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int m = s.nextInt();
        int[] arr1 = new int[m];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }
        
        int[] sum = new int[n > m? n : m];
        int c = 0 ;

        int i = n -  1 ;
        int j = m - 1  ;
        int k = sum.length - 1 ;

        while(k >= 0 ){
            int d = c ;

            if(i >= 0 ){
                d += arr[i];
            }

            if(j >= 0 ){
                d += arr1[j];
            }

            c = d/10 ;
            d = d%10 ;

            sum[k] = d ;
            
            i--;
            j--;
            k--;
        }

        if(c != 0){
            System.out.println(c);
        }

        for(int val : sum){
            System.out.println(val);
        }
    }
}
