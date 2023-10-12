import java.util.Scanner;

public class PrintOnetoNusingBacktracking {

    public static void print(int i , int n){
        if(i>n) return ;

        print(i+1, n);
        System.out.print(i);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        print(1, n);
    }
}
