import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 1;
        for(int i = 1 ; i <= n ; i++ ) {
            for(int j = 1 ; j <= i ; j++){
                System.out.print(x);
                System.out.print("\t");
                x = x + 1;
            }
            System.out.println();
        }
    }
}
