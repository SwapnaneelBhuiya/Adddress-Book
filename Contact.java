public class Contact {
    public static String first_name;
    public static String last_name;
    public static String address;
    public static String city;
    public static String state;
    public static String zip;
    public static String phone_number;
    public static String email;

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
            first_name = a;
        }

        public static String setLast_name(String a) {
            last_name = a;
        }

        public static String setAddress(String a) {
            address = a;
        }

        public static String setCity(String a) {
            city = a;
        }

        public static String setState(String a) {
            state = a;
        }

        public static String setZip(String a) {
            zip = a;
        }

        public static String setPhone_number(String a)
        {
            phone_number = a;
        }

        public static String setEmail(String a)
        {
            email = a;
        }
    public Contact(String a, String b, String c, String d, String e, String f, String g, String h) {
        first_name = a;
        last_name = b;
        address = c;
        city = d;
        state = e;
        zip = f;
        phone_number = g;
        email = h;
    }
}