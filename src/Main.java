import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Box ob1=new Box();
        Scanner sc=new Scanner(System.in);
        ob1.length=sc.nextInt();
        ob1.width=sc.nextInt();
        ob1.height=sc.nextInt();
        System.out.println(ob1.volume());
        System.out.println(ob1.surfacearea());
    }
}
