import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;
class Contact2
{
    String firstName,lastName,address,city,state,zip,phoneNumber;
    Contact2(String fName,String lName,String addressFull,String cityName,String stateName,String zipCode,String phnNumber)
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
        System.out.println("The details of the contacts are: ");
        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Zip : " + zip);
        System.out.println("Phone number : " + phoneNumber);
    }
    boolean findFirstName(String name)
    {
        if(firstName.equals(name))
            return true;
        return false;
    }
    boolean findLastName(String name)
    {
        if(lastName.equals(name))
            return true;
        return false;
    }
    void setAddress(String addressFull) {
        address = addressFull;
    }

    void setCity(String cityName) {
        city = cityName;
    }

    void setState(String stateName) {
        state = stateName;
    }

    void setZip(String zipCode) {
        zip = zipCode;
    }

    void setPhoneNumber(String phnNumber) {
        phoneNumber = phnNumber;
    }
}
public class AddressBook2 {
    LinkedList<Contact2>AddressList;
    Map<String,Contact2>AddressMap;
    AddressBook2()
    {
        AddressList = new LinkedList<>();
        AddressMap = new HashMap<>();
    }
    void addContact(String fname,String lname,String addressFull,String cityName, String stateName,String zipCode, String phoneNumber)
    {
        Contact2 c = new Contact2(fname,lname,addressFull,cityName,stateName,zipCode,phoneNumber);
        AddressList.add(c);
        AddressMap.put(fname+lname,c);
        c.display();
    }
    void searchContact(String searchName)
    {
        Contact2 c = (AddressMap.get(searchName));
        c.display();
        System.out.println("Contact found. Choose the details to edit:");
        System.out.println("1. Address, 2. City, 3. State, 4. Zip,5. Phone number");
        Scanner sc= new Scanner(System.in);
        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                System.out.println("Enter the new address: ");
                c.setAddress(sc.nextLine());
                break;
            case 2:
                System.out.println("Enter the new city: ");
                c.setCity(sc.nextLine());
                break;
            case 3:
                System.out.println("Enter the new state: ");
                c.setState(sc.nextLine());
                break;
            case 4:
                System.out.println("Enter the new zip code: ");
                c.setZip(sc.nextLine());
                break;
            case 5:
                System.out.println("Enter the new phone number: ");
                c.setPhoneNumber(sc.nextLine());
                break;
            default:
                System.out.println("Invalid choice");
        }
        c.display();
    }
    void deleteContact(String fname,String lname)
    {
        AddressMap.remove(fname+lname);
        for(int i=0;i<AddressList.size();i++)
        {
            String a = (AddressList.get(i)).firstName;
            String b = (AddressList.get(i)).lastName;
            if (a.equals(fname) && b.equals(lname))
            {
                AddressList.remove(AddressList.get(i));
            }
        }
    }
    void displayAllContacts()
    {
        for(int i=0;i<AddressList.size();i++)
        {
            (AddressList.get(i)).display();
        }
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of contacts: ");
        n = sc.nextInt();
        AddressBook2 book2 = new AddressBook2();
        for(int i=0;i<n;i++)
        {
            String fName,lName,addressFull,cityName,stateName,zipCode,phnNumber;
            System.out.println("Enter the firstname,lastname,address,city,state,zip and phone number");
            fName = sc.next();
            lName = sc.next();
            addressFull = sc.next();
            cityName = sc.next();
            stateName = sc.next();
            zipCode = sc.next();
            phnNumber = sc.next();
            book2.addContact(fName,lName,addressFull,cityName,stateName,zipCode,phnNumber);
        }
        String searchfirstName,searchlastName;
        System.out.println("Enter the first name and last name you want to search: ");
        searchfirstName = sc.next();
        searchlastName = sc.next();
        book2.searchContact(searchfirstName+searchlastName);
        System.out.println("Enter the first name and last name you want to delete: ");
        searchfirstName = sc.next();
        searchlastName = sc.next();
        book2.deleteContact(searchfirstName,searchlastName);
        book2.displayAllContacts();
    }
}
