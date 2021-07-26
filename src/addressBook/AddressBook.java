package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static Scanner sc = new Scanner(System.in);
	public ArrayList<ContactOfPerson> contactList = new ArrayList<>();

	public void addContactDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Details of ContactDetails");
		System.out.println("Enter the first name");
		String firstName = scanner.next();
		System.out.println("Enter the Last name");
		String lastName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City"); // getting from user input using console
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the email");
		String email = scanner.next();
		System.out.println("Enter the ZipCode");
		String zip = scanner.next();
		System.out.println("Enter the ZipCode");
		String zipCode = scanner.next();
		System.out.println("Enter the contact number...");
		String phoneNumber = scanner.next();

		ContactOfPerson contactofPerson = new ContactOfPerson(firstName, lastName, address, city, state, email,
				phoneNumber, zip);
		contactList.add(contactofPerson);
	}

	public boolean editContactDetails(String Name) {
		int flag = 0;
		for (ContactOfPerson contact : contactList) {
			if (contact.getFirstName().equals(Name)) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Address: ");
				String address = scanner.next();
				contact.setAddress(address);
				System.out.println("Enter City: ");
				String city = scanner.next();
				contact.setCity(city);
				System.out.println("Enter State: ");
				String state = scanner.next();
				contact.setState(state);
				System.out.println("Enter Email: ");
				String email = scanner.next();
				contact.setEmail(email);
				System.out.println("Enter Phone Number:");
				String phoneNumber = scanner.next();
				contact.setPhoneNumber(phoneNumber);
				System.out.println("Enter Zip Code: ");
				String zip = scanner.next();
				contact.setZip(zip);
				flag = 1;
			}
		}
		return flag == 1;

	}

	public boolean deleteContact(String name) {
		int flag = 0;
		for (ContactOfPerson contact : contactList) {
			if (contact.getFirstName().equals(name)) {
				contactList.remove(contact);
				flag = 1;
				break;
			}
		}
		return flag == 1;
	}

}
