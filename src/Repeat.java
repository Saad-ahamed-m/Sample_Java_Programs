import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Repeat {
    public static void main(String args[])
    {
        ArrayList <Integer>list=new ArrayList<>();
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        for(i=0;i<n;i++)
        {
            if(Collections.frequency(list,list.get(i))>1){
                System.out.println("The first repeating number is "+list.get(i));
                System.exit(0);
            }
        }
        System.out.println("There are no repeating numbers");
    }
}
