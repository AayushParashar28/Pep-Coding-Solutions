import java.util.Scanner ;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n>90)
        {
            System.out.println("Excellent");
        }
        else if(n>80 && n<=90 )
        {
            System.out.println("Good");
        }
        else if(n>70 && n<=80 )
        {
            System.out.println("Fair");
        }
        else if(n>60 && n<=70 )
        {
            System.out.println("Meets Expectations");
        }
        else if(n<=60 )
        {
            System.out.println("Below Par");
        }
    }
}
