import java.util.Scanner;

public class InverseANumber {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    int inverted = 0;
    int power = 1;

    while (n > 0) {
      int digit = n % 10;
      n = n / 10;
      inverted += power * Math.pow(10, digit - 1);
      power++;
    }
    System.out.println(inverted);
 }
}
