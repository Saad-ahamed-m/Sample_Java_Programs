public class Prime{
    Boolean prime(int val)
    {
        int i;
        Boolean p=true;
        for(i=2;i<val;i++)
        {
            if(val%i==0)
            {
                p=false;
                break;
            }
        }
        return p;
    }
}