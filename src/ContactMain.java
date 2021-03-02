import java.util.ArrayList;
import java.util.Scanner;
public class ContactMain {
    public static void main(String args[])
    {
        ArrayList<Contacts> c=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String temp;
        System.out.println("Enter the choice : \n 1. Add Details \n 2. Delete Details \n 3. Update Details \n 4. List Details \n 5. Search Details \n 6. Exit");
        int n=sc.nextInt();
        sc.nextLine();
        while(n!=6) {
            switch(n)
            {
                case 1: {
                    temp=sc.nextLine();
                    System.out.println(temp);
                    c.add(new Contacts(temp, sc.nextLine()));
                    break;
                }
                case 2: {
                    int flag=0;
                    int j=0;
                        temp=sc.nextLine();
                        for(Contacts i:c) {
                            if (i.name.equals(temp)) {
                                c.remove(j);
                                flag = 1;
                                break;
                            }
                            j++;
                        }
                            if(flag==0)
                                System.out.println("The contact does not exist");
                            break;
                }
                case 3:
                {
                    temp=sc.nextLine();
                    int j=0;
                    String mob=sc.nextLine();
                    System.out.println(mob);
                    for (Contacts i:c) {
                        if (i.name.equals(temp)) {
                            i.contactnumber = mob;
                            c.set(j,i);
                            break;
                        }
                        j++;
                    }
                    break;
                }
                case 4:
                {
                    for (Contacts i : c)
                        System.out.println(i.name + " " + i.contactnumber);
                    break;
                }
                case 5:
                {
                    temp=sc.nextLine();
                    for (Contacts i : c)
                        if(temp.equals(i.name)) {
                            System.out.println("The details are available");
                            break;
                        }
                    break;
                }
                case 6:
                {
                    System.exit(0);
                }
            }
            System.out.println("Enter the choice : \n 1. Add Details \n 2. Delete Details \n 3. Update Details \n 4. List Details \n 5. Search Details \n 6. Exit");
            n=sc.nextInt();
            sc.nextLine();
        }
    }
}
