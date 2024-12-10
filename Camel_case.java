import java.util.*;
public class Camel_case {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String res=" ";
    for(int i=0;i<a.length();i++)
    {
        char s=a.charAt(i);
        s^=32;
        res+=s;
    }
    System.out.println(res);
}    
}
