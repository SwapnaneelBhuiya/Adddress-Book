import java.util.*;
public class Dictionary extends AddressBookMain
{
    public static HashMap<String, ArrayList<Contact>> dict=new HashMap<String, ArrayList<Contact>>();
    public static HashMap<String, String> dict_by_city;
    public static HashMap<String, String> dict_by_state;
    public void add_by_city_and_state()
    {
        Iterator it = dict.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry cont = (Map.Entry)it.next();
            for(Contact i:cont.getValue())
            {
                dict_by_city.put(i.getCity(),i.getFirst_name()+" "+i.getLast_name());
                dict_by_state.put(i.getState(),i.getFirst_name()+" "+i.getLast_name());
            }
    }
        public void search_by_city(String city)
        {
            System.out.println("People living in the city "+city+" are");
            Iterator it = dict_by_city.entrySet().iterator();
            while(it.hasNext())
            {
                Map.Entry c=(Map.Entry)it.next();
                if(c.getKey().equals(city))
                    System.out.println(c.getValue());
            }
        }
        public void search_by_state(String state)
        {
            System.out.println("People living in the state "+state+" are");
            Iterator it = dict_by_state.entrySet().iterator();
            while(it.hasNext())
            {
                Map.Entry c=(Map.Entry)it.next();
                if(c.getKey().equals(state))
                    System.out.println(c.getValue());
            }
        }
        public void contact_details()
        {
            Iterator it = dict.entrySet().iterator();
            System.out.println("Contact Namewise Details");
            while(it.hasNext())
            {
                Map.Entry cont = (Map.Entry)it.next();
                String names=cont.getKey();
                ArrayList<Contact> ar=cont.getValue();
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
    public static void add_dict(ArrayList<Contact> ar)
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of the Address book");
            dict.put(sc.nextLine(),ar);
    }


}