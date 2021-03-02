import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lapindrome {
    public static void main(String args[])
    {
        String s= new Scanner(System.in).nextLine();
        HashMap <Character,Integer>map=new HashMap();
        HashMap <Character,Integer>map1=new HashMap();
        int length=s.length();
        int i,temp;
        char chartemp;
        if(length%2==0)
        {
            for(i=0;i<length/2;i++)
            {
                if(map.containsKey(s.charAt(i))==false)
                    map.put(s.charAt(i),1);
                else
                {
                   temp=map.get(s.charAt(i));
                   map.put(s.charAt(i),temp++);
                }
            }
            for(i=length/2;i<length;i++)
            {
                if(map1.containsKey(s.charAt(i))==false)
                    map1.put(s.charAt(i),1);
                else
                {
                    temp=map1.get(s.charAt(i));
                    map1.put(s.charAt(i),temp++);
                }
            }
            if(map.size()==map1.size())
            {
                for(Map.Entry<Character,Integer> entry:map.entrySet())
                {
                    chartemp=entry.getKey();
                    if(map1.containsKey(chartemp)&&map.get(chartemp)==map1.get(chartemp))
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("It is not a lapindrome");
                        System.exit(0);
                    }
                }
                System.out.println("It is a lapindrome");
            }
            else
            {
                System.out.println("It is not a lapindrome");
            }
        }
        else
        {
            for(i=0;i<length/2;i++)
            {
                if(map.containsKey(s.charAt(i))==false)
                    map.put(s.charAt(i),1);
                else
                {
                    temp=map.get(s.charAt(i));
                    map.put(s.charAt(i),temp++);
                }
            }
            for(i=(length/2)+1;i<length;i++)
            {
                if(map1.containsKey(s.charAt(i))==false)
                    map1.put(s.charAt(i),1);
                else
                {
                    temp=map1.get(s.charAt(i));
                    map1.put(s.charAt(i),temp++);
                }
            }
            if(map.size()==map1.size())
            {
                for(Map.Entry<Character,Integer> entry:map.entrySet())
                {
                    chartemp=entry.getKey();
                    if(map1.containsKey(chartemp)&&map.get(chartemp)==map1.get(chartemp))
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println("It is not a lapindrome");
                        System.exit(0);
                    }
                }
                System.out.println("It is a lapindrome");
            }
            else
            {
                System.out.println("It is not a lapindrome");
            }
        }
    }
}
