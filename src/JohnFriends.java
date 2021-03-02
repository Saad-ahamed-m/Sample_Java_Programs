import java.util.*;

public class JohnFriends {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=new String(sc.nextLine());
        String temp="";
        s=s.toUpperCase();
        StringTokenizer st=new StringTokenizer(s,";");
        while(st.hasMoreTokens()) {
            temp=temp+(st.nextToken())+":";
        }
        System.out.println(temp);
        String firstname,lastname;
        HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
        st=new StringTokenizer(temp,":");
        while(st.hasMoreTokens())
        {
            firstname=st.nextToken();
            lastname=st.nextToken();
            if(map.containsKey(lastname)==false)
            {
                ArrayList<String> val=new ArrayList<>();
                val.add(firstname);
                map.put(lastname,val);
            }
            else
            {
                map.get(lastname).add(firstname);
            }
        }
     TreeMap<String,ArrayList<String>> tm=new TreeMap<>(map);
        for (Map.Entry<String, ArrayList<String>>
                entry : tm.entrySet())
        {
            ArrayList<String> list=new ArrayList<>(entry.getValue());
            Collections.sort(list);
            for(String i:list)
                System.out.print("(" + entry.getKey() + "," + i+")");
        }
    }

}
