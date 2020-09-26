import java.util.*;
public class AddressBookMain
{
    public static String first_name;
    public static String last_name;
    public static String address;
    public static String city;
    public static String state;
    public static String zip;
    public static String phone_number;
    public static String email;
    public static ArrayList<AddressBookMain> Address_Book=new ArrayList<AddressBookMain>();


    public static String getFirst_name() {
        return first_name;
    }

    public static String getLast_name() {
        return last_name;
    }

    public static String getAddress() {
        return address;
    }

    public static String getCity() {
        return city;
    }

    public static String getState() {
        return state;
    }

    public static String getZip() {
        return zip;
    }

    public static String getPhone_number() {
        return phone_number;
    }

    public static String getEmail() {
        return email;
    }
    public static String setFirst_name(String a) {
         first_name=a;
    }

    public static String setLast_name(String a) {
         last_name=a;
    }

    public static String setAddress(String a) {
         address=a;
    }

    public static String setCity(String a) {
         city=a;
    }

    public static String setState(String a) {
         state=a;
    }

    public static String setZip(String a) {
         zip=a;
    }

    public static String setPhone_number(String a) {
         phone_number=a;
    }

    public static String setEmail(String a) {
         email=a;
    }
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
        for(int i=0;i<5;i++)//assuming 5 entries
        {
            System.out.println("Enter user info");
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            String f = sc.nextLine();
            String g = sc.nextLine();
            String h = sc.nextLine();
            AddressBookMain obj = new AddressBookMain(a, b, c, d, e, f, g, h);
            Address_Book.add(obj);
        }
        System.out.println("Enter first and last name of person to be edited");
        String temp_fname=sc.nextLine();
        String temp_lname=sc.nextLine();
        for(int i=0;i<5;i++)
        {
            if(Address_Book(i).getFirst_name().equals(temp_fname)&&Address_Book(i).getLast_name().equals(temp_lname))
            {
                System.out.println("Enter new details");
                Address_Book(i).setAddress(sc.nextLine());
                Address_Book(i).setCity(sc.nextLine());
                Address_Book(i).setState(sc.nextLine());
                Address_Book(i).setZip(sc.nextLine());
                Address_Book(i).setPhone_number(sc.nextLine());
                Address_Book(i).setEmail(sc.nextLine());
                break;
            }
        }
        
    }
}