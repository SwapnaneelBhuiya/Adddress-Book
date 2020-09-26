import java.util.*;
public class AddressBookMain
{
    public static ArrayList<AddressBookMain> Address_Book;
    Scanner sc=new Scanner(System.in);
    public static AddressBookMain()
    {
        Address_Book=new ArrayList<AddressBookMain>();
    }
    public static void Contact_delete(int i)
    {
        Address_Book.remove(i);
    }
    public void Add_Contact()
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
            Contact obj = new Contact(a, b, c, d, e, f, g, h);
            Address_Book.add(obj);
    }
    public void contact_edit()
    {
        System.out.println("Enter first and last name of person to be edited");
        String temp_fname=sc.nextLine();
        String temp_lname=sc.nextLine();
        int c=0;
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
                c=1;
                break;
            }
        }
        if(c==0)
            System.out.println("Name not found");
    }
    public ArrayList<AddressBookMain> get_alist()
    {
        return Address_Book;
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to the Address Book problem in Address Book Main class");
        AddressBookMain obj=new AddressBookMain();
        while(true)
        {
            System.out.println(" Press 1 to Enter Contact");
            System.out.println(" Press 2 to edit existing contact");
            System.out.println(" Press 3 to delete existing contact");
            System.out.println(" Press 4 to Exit");
            int n=sc.nextInt();sc.nextLine();
            switch(ch) {
                case 1:
                    obj.Add_Contact();
                    break;
                case 2:
                    obj.contact_edit();
                    break;
                case 3:
                    System.out.println("Enter first and last name of person to be deletd");
                    String temp_fname=sc.nextLine();
                    String temp_lname=sc.nextLine();
                    int c=0;
                    for(int i=0;i<5;i++)
                        if(Address_Book(i).getFirst_name().equals(temp_fname)&&Address_Book(i).getLast_name().equals(temp_lname))
                        {
                            Contact_delete(i);c=1;
                            break;
                        }
                    if(c==0)
                        System.out.println("Name to be deleted not found");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter again!");
            }
        }
    }
}