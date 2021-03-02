import java.util.Scanner;

public class Chemicals {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt(),h=sc.nextInt(),o=sc.nextInt();
        int cc,hc,oc;
        int result;
        result=0;
        if(h<2||o<1)
        System.out.print("(0,");
        else
        {
            hc=h/2;
            oc=o;
            if(hc<oc)
            {
                result=result+hc;
                o=o-hc;
                h=h-(hc*2);
            }
            else if(oc<=hc)
            {
                result=result+oc;
                o=o-oc;
                h=h-(oc*2);
            }
            System.out.print("("+result+",");
        }
        result=0;
        if(c<1||o<2)
            System.out.print("0,");
        else
        {
            cc=c;
            oc=o/2;
            if(cc<oc)
            {
                result=result+cc;
                c=c-cc;
                o=o-(cc*2);
            }
            else if(oc<=cc)
            {
                result=result+oc;
                c=c-oc;
                o=o-(oc*2);
            }
            System.out.print(result+",");
        }
        result=0;
        if(c<1||h<4)
            System.out.print("0)");
        else
        {
            cc=c;
            hc=h/4;
            if(cc<hc)
            {
                result=result+cc;
                c=c-cc;
                h=h-(cc*4);
            }
            else if(hc<=cc)
            {
                result=result+hc;
                c=c-hc;
                h=h-(hc*4);
            }
            System.out.print(result+")");
        }
    }
}
