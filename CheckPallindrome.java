import java.util.*;
import javax.print.DocFlavor.STRING;

public class CheckPallindrome {

    public static void checkpalidrome(String str){
        int n = str.length();

        for(int i = 0 ; i < n/2 ; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("false");
            }
        }
        System.out.println("True");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        
        checkpalidrome(n);
        
    }
}
