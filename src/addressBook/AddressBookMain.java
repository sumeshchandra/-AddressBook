package addressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<ContactOfPerson> al = null;

    AddressBookMain() {
        al = new ArrayList<>();
    }

    static ContactOfPerson ContactDetails;

  public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details of ContactDetails");
        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the Last name");
        String lastName = sc.next();
        System.out.println("Enter the Address");
        String address = sc.next();
        System.out.println("Enter the City");                        //getting from user input using console
        String city = sc.next();
        System.out.println("Enter the State");
        String state = sc.next();
        System.out.println("Enter the ZipCode");
        String zipCode = sc.next();
        System.out.println("Enter the contact number...");
        String phoneNumber = sc.next();

       al.add(new ContactOfPerson(firstName, lastName, address, city, state, zipCode, phoneNumber));
    }

    public void edit(ContactOfPerson contactDetails) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Address");
        ContactDetails.address = sc.next();
        System.out.println("Enter the City");
        ContactDetails.city = sc.next();
        System.out.println("Enter the State");
        ContactDetails.state = sc.next();
        System.out.println("Enter the ZipCode");
        ContactDetails.zip = sc.next();
        System.out.println("Enter the contact number...");
        ContactDetails.phoneNo = sc.next();

    }

    public void delete(ContactOfPerson contact) {
        al.remove(contact);
    }

    static void menu() {
        ContactOfPerson ContactDetails = null;
        AddressBookMain addressBookMain = new AddressBookMain();
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur choice \n 1 : Add \n 2 : Edit \n 3 : Delete \n 4 : Display ");
            choice = sc.nextInt();   // taking user choice between the given 4 choice
            switch (choice) {
                case 1:
                    addressBookMain.add();
                    break;
                case 2:
                    System.out.println("Enter the ContactDetails Name to edit details..");
                    String firstName = sc.next();
                   ArrayList<ContactOfPerson> personList = addressBookMain.al;
                   for (int i =0;i<personList.size();i++){
                       if(personList.get(i).firstName.equals(firstName)) {
                           ContactOfPerson contactDetails = personList.get(i);

                           addressBookMain.edit(ContactDetails);
                       } else {
                           System.out.println(firstName + " is not exists ");
                       }
                   }

                    break;
                case 3:
                    System.out.println("Enter the ContactDetails name to Delete the Details");
                    firstName = sc.next();
                    ArrayList <ContactOfPerson> personLists= addressBookMain.al;
                    for (int i=0;i<personLists.size();i++) {
                        if (personLists.get(i).firstName.equals(firstName)) {
                            ContactOfPerson Contact =personLists.get(i);
                            addressBookMain.delete(Contact);
                        }}
                    break;
                case 4:
                    System.out.println(addressBookMain.al);
                    break;
                default:
                    System.out.println("Enter Num from 1 to 4");
            }
        } while (choice < 5);
    }

    public static void main(String[] args) {

        menu();

    }
}
