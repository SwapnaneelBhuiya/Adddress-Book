import java.util.*;
public class AddressBookMain
{
    public static final String first_name;
    public static final String last_name;
    public static final String address;
    public static final String city;
    public static final String state;
    public static final String zip;
    public static final String phone_number;
    public static final String email;

    public AddressBookMain(String a, String b, String c, String d, String e, String f, String g, String h)
    {
        first_name=a;
        last_name=b;
        address=c;
        city=d;
        state=e;
        zip=f;
        phone_number=g;
        email=h;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Address Book problem in Address Book Main class");
        System.out.println("Enter user info");
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();
        String e=sc.nextLine();
        String f=sc.nextLine();
        String g=sc.nextLine();
        String h=sc.nextLine();
        AddressBookMain obj=new AddressBookMain(a,b,c,d,e,f,g,h);
    }
}