import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vowels {
    public static void main(String args[])
    {
        String s=new Scanner(System.in).nextLine();
        List<Character> list=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        String result="";
        int length=s.length();
        int i;
        for(i=0;i<length;i++)
        {
            if(list.contains(s.charAt(i))==false) {
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
