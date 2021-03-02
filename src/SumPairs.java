import java.util.ArrayList;
import java.util.Scanner;

public class SumPairs {
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt(),i,j;
        int sum;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the sum");
        sum=sc.nextInt();
        System.out.println("Pair of elements whose sum is equal to "+sum+" are:");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(list.get(i)+list.get(j)==sum)
                    System.out.println(list.get(i)+" "+list.get(j));
            }
        }
    }
}
