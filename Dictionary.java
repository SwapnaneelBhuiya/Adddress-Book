import java.util.*;
public class Dictionary extends AddressBookMain
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Address Books");
        int n=sc.nextInt();sc.nextLine();
        HashMap<String, AddressBookMain> dict=new HashMap<String, AddressBookMain>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number of contacts to add");
            int m=sc.nextInt();sc.nextLine();
            AddressBookMain obj=new AddressBookMain();
            for(int j=0;j<m;j++)
            {
                obj.Add_Contact();
            }
            System.out.println("Enter the name of the Address book");
            dict.put(sc.nextLine(),obj);
        }
        Iterator it = dict.entrySet().iterator();
        System.out.println("Contact Namewise Details");
        while(it.hasNext())
        {
            Map.Entry cont = (Map.Entry)it.next();
            String names=cont.getKey();
            AddressBookMain ob=cont.getValue();
            ArrayList<AddressBookMain> ar=ob.get_alist();
            System.out.println("The name is: "+names);
            for(int i=0;i<ar.size();i++)
            {
                System.out.println(ar.getFirst_name());
                System.out.println(ar.getLast_name());
                System.out.println(ar.getAddress());
                System.out.println(ar.getCity());
                System.out.println(ar.getState());
                System.out.println(ar.getZip());
                System.out.println(ar.getPhone_number());
                System.out.println(ar.getEmail());
            }
        }
    }
}