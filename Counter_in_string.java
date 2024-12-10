import java.util.*;
public class Counter_in_string{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      String a=sc.next();
      int vc=0;
      int cc=0;
      int nc=0;
      int sp=0;
      for(int i=0;i<a.length();i++)
      {
        if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
        {
          vc+=1;
        }else if(a.charAt(i)>=65 && a.charAt(i)<=90 || a.charAt(i)>=97 && a.charAt(i)<=122)
        {
          cc+=1;
        }else if(a.charAt(i)>=48 && a.charAt(i)<=57)
        {
          nc+=1;
        }else{
          sp+=1;
        }
      }
      System.out.println("Vowels Count :"+vc);
      System.out.println("Consonant Count :"+(cc));
      System.out.println("Numbers Count :"+nc);
      System.out.println("Special Character Count :"+sp);
  }
}
