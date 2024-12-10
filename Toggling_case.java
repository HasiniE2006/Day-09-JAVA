import java.util.*;
public class Toggling_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        s^=32;
        System.out.println(s);
    }
    
}
