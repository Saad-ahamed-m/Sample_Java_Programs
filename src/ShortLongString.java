import java.util.LinkedList;
import java.util.Scanner;

public class ShortLongString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        int i;
        int min=10000,max=0;
        String temp="Default";
        for(i=0;i<10;i++)
        {
            temp=sc.nextLine();
            if(temp.length()>max)
                max=temp.length();
            if(temp.length()<min)
                min=temp.length();
            list.add(temp);
        }
        for(String tem:list)
            if(tem.length()==min)
            {
                System.out.println("The shortest String is encountered first");
                break;
            }
            else if(tem.length()==max)
            {
                System.out.println("The longest String is encountered first");
                break;
            }

    }
}
