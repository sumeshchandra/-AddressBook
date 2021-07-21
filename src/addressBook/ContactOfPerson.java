package addressBook;

public class ContactOfPerson {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phoneNo;

    public ContactOfPerson(String firstName, String lastName, String address, String city, String state, String zip,
                           String phoneNo) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        String addressString = "Name: " + firstName + " " + lastName +
                "\nPhone: " + phoneNo +
                "\nAddress: " + address + ", " + city + ", " + state +
                "\nZIP: " + zip;
        return addressString;
    }

//    public static void main(String[] args) {
//        ContactOfPerson c = new ContactOfPerson("Sumesh", "Jena", "Basanty Colony", "Rourkela", "Odisha", "769012", "7008944265");
//        System.out.println(c);
//    }//

}