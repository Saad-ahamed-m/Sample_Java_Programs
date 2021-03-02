public class Permute {
    public void permute(char[]a,int len,int val)
    {
        char temp;
        if(len==val)
            System.out.println(String.valueOf(a));
        else
        {
            int i;
            for(i=len;i<=val;i++)
            {
                temp=a[len];
                a[len]=a[i];
                a[i]=temp;
                permute(a,len+1,val);
                temp=a[len];
                a[len]=a[i];
                a[i]=temp;
            }
        }
    }
}
