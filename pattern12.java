import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int start = 0;
        int end = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(start);
                System.out.print("\t");
                int sum = start + end;
                start = end ;
                end = sum ;
            }
            System.out.println();
        }
    }
}
