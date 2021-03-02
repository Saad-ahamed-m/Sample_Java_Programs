import java.util.Scanner;
import java.util.TreeMap;

public class HighKey {
    public static void main(String args[])
    {
        TreeMap<String ,String> map=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int i;
        String val;
        for(i=0;i<n;i++)
        {
            val=sc.nextLine();
            map.put(val,sc.nextLine());
        }
        System.out.println(map.lastEntry());
    }
}
