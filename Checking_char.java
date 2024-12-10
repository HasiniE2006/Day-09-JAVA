import java.util.*;
public class Checking_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if((s&32)==0)
         System.out.println("UPPER_CASE");
        else
        System.out.println("LOWER_CASE");
    }
    
}
