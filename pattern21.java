import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0 ; i < n ; i++ ){
            for(char ch = (char)('E' - i) ;  ch <= 'E' ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
