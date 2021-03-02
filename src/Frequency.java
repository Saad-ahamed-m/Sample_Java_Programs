import java.util.Scanner;
public class Frequency {
public static void main(String args[])
{
    String s=new Scanner(System.in).nextLine();
    int i,j,flag=1;
    char r='#';
    int n=s.length();
    System.out.println("Character     Frequency");
    for(i=0;i<n;i++)
    {
        if(s.charAt(i)!='#')
        {
            int count=1;
           for(j=i+1;j<n;j++)
           {
               if(s.charAt(j)==(s.charAt(i))){
                   count++;
               }
           }
           System.out.println("  "+s.charAt(i)+"        |    "+count);
           if(count==1 && flag==1) {
               r = s.charAt(i);
               flag++;
           }
           s=s.replace(s.charAt(i),'#');
        }
    }
    if(r!='#')
    System.out.println("\nThe first non-repeating character is "+r);
    else
        System.out.println("\nThere is no non-repeating character");
}

}
