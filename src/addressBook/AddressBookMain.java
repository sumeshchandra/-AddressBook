package addressBook;

import java.util.Scanner;

public class AddressBookMain {

    static ContactOfPerson ContactDetails;

    static ContactOfPerson add() {
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

        return new ContactOfPerson(firstName, lastName, address, city, state, zipCode, phoneNumber);
    }

    static ContactOfPerson edit(ContactOfPerson contactDetails) {
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
        return ContactDetails;
    }

    static void menu() {
        ContactOfPerson ContactDetails = null;
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur choice \n 1 : Add \n 2 : Edit \n 3 : Display ");
            choice = sc.nextInt();   // taking user choice between the given 3 choice
            switch (choice) {
                case 1:
                    ContactDetails = add();
                    break;
                case 2:
                    System.out.println("Enter the ContactDetails Name to edit details..");
                    String firstName = sc.next();
                    if (firstName.equals(ContactDetails.firstName)) {
                        ContactDetails = edit(ContactDetails);
                    } else {
                        System.out.println(firstName + " is not exists ");
                    }
                    break;
                case 3:
                    System.out.println(ContactDetails);
                    break;
                default:
                    System.out.println("Enter Num from 1 to 3");
            }
        } while (choice < 3);
    }

    public static void main(String[] args) {

        menu();

    }
}
