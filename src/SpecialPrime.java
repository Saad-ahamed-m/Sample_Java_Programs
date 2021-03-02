import java.util.ArrayList;
import java.util.Scanner;

public class SpecialPrime {
    public static void main(String args[])
    {
        int l,h,i,count=0,val,j;
        ArrayList<Integer>list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        Prime p=new Prime();
        l=sc.nextInt();
        h=sc.nextInt();
        for(i=l;i<=h;i++)
        {
            list.add(i);
        }
        if(list.contains(2))
            count=1;
        for(i=1;i<=h;i++)
        {
            for(j=0;;j++)
            {
                val=(int)(Math.pow(2,i)*Math.pow(3,j))+1;
                if(val>h)
                    break;
                if(p.prime(val)==true)
                {
                    if(list.contains(val))
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

