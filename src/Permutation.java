import java.util.Scanner;
public class Permutation {

    public static void main(String args[])
    {
        String s=new Scanner(System.in).nextLine();
        char[]sa=s.toCharArray();
        Permute p=new Permute();
        p.permute(sa,0,s.length()-1);
    }
}


