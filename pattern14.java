import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1 ; i <= 10 ; i++){
            int m = n*i ;
            System.out.println(n + "*\t" + i + "=\t" + m);
        }
    }
}
