 import java.util.*;
 public class test4{
    public static void main(String[] args) {
     anagram a=new anagram();  
     Scanner o=new Scanner(System.in);
     System.out.println(" enter the two strings");
     String s1,s2;
     	s1=o.next();
     	s2=o.next();
        a.isAnagram(s1,s2);  
        
    }
}