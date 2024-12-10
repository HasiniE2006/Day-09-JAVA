import java.util.*;
public class Repetitive_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
         c[((int)(a.charAt(i)))-65]++;
        int max=0;
        int index=0;
        for(int i=0;i<26;i++)
        {
            if(c[i]>max)
            {
                max=c[i];
                index=i;
            }
        }
        System.out.println((char)(index+65));
    }
    
}
