import java.util.Scanner;
import java.util.StringTokenizer;
class Platform {
    public static int findPlatform(int arr[],int dep[],int n)
    {
        int plat_needed=1,result=1;
        int i=1,j=0;
        for (i=0;i<n;i++) {
            plat_needed=1;

            for (j=i+1;j<n;j++) {
                if ((arr[i]>=arr[j]&&arr[i]<=dep[j])||(arr[j]>=arr[i]&&arr[j]<=dep[i]))
                    plat_needed++;
            }
            result=Math.max(result,plat_needed);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arrival=sc.nextLine();
        String departure =sc.nextLine();
        String avalues="",dvalues="";
        StringTokenizer st;
        st=new StringTokenizer(arrival,":");
        int i=0;
        int arr[]=new int[100];
        int dep[]=new int[100];
        while(st.hasMoreTokens())
        {
            avalues=st.nextToken()+st.nextToken();
            System.out.println(avalues);
            arr[i++]=Integer.parseInt(avalues);
        }
        st=new StringTokenizer(departure,":");
        i=0;
        while(st.hasMoreTokens())
        {
            dvalues=st.nextToken()+st.nextToken();
            dep[i++]=Integer.parseInt(dvalues);
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            System.out.println(dep[i]);
        }
        System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
    }
}
