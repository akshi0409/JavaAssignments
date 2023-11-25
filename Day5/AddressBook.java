import java.util.Scanner;
class Contact
{
    String firstName,lastName,address,city,state,zip,phoneNumber;
    Contact(String fName,String lName,String addressFull,String cityName,String stateName,String zipCode,String phnNumber)
    {
        firstName = fName;
        lastName = lName;
        address = addressFull;
        city = cityName;
        state = stateName;
        zip = zipCode;
        phoneNumber = phnNumber;
    }
    void display()
    {
        System.out.println("The details of the contact are: ");
        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Zip : " + zip);
        System.out.println("Phone number : " + phoneNumber);
    }
}
public class AddressBook {
    public static void main(String args[])
    {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        String fName,lName,addressFull,cityName,stateName,zipCode,phnNumber;
        System.out.println("Enter the firstname,lastname,address,city,state,zip and phone number");
        fName = sc.nextLine();
        lName = sc.nextLine();
        addressFull = sc.nextLine();
        cityName = sc.nextLine();
        stateName = sc.nextLine();
        zipCode = sc.nextLine();
        phnNumber = sc.nextLine();
        Contact c = new Contact(fName,lName,addressFull,cityName,stateName,zipCode,phnNumber);
        c.display();
    }
}
