import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int temp1 = n1;
        int temp2 = n2;
        while (n1 % n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int HCF = n2 ;
        int LCM = (temp1 * temp2) / n2;
        System.out.println(HCF);
        System.out.println(LCM);
    }
}
