import java.util.*;
public class Length_of_last_string {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int d=s1.length;
        String h=s1[d-1];
        System.out.println(h.length());
    }
    
}
