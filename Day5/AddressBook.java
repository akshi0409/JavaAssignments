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
public class AddressBook {
    public static void main(String args[])
    {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of contacts: ");
        n = sc.nextInt();
        Contact[] c = new Contact[n];
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
            c[i] = new Contact(fName,lName,addressFull,cityName,stateName,zipCode,phnNumber);
            c[i].display();
        }
        String searchFirst,searchLast;
        System.out.println("Enter the first name and last name of the contact you want to update.");
        searchFirst = sc.next();
        searchLast = sc.next();
        for(int i=0;i<n;i++)
        {
            if(c[i].findFirstName(searchFirst) && c[i].findLastName(searchLast)) {
                System.out.println("Contact found. Choose the details to edit:");

                System.out.println("1. Address, 2. City, 3. State, 4. Zip,5. Phone number");

                int ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.println("Enter the new address: ");
                        c[i].setAddress(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter the new city: ");
                        c[i].setCity(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter the new state: ");
                        c[i].setState(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter the new zip code: ");
                        c[i].setZip(sc.nextLine());
                        break;
                    case 5:
                        System.out.println("Enter the new phone number: ");
                        c[i].setPhoneNumber(sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                c[i].display();
                break;
            }
        }
        System.out.println("Enter the first name and last name of the contact you want to delete.");
        searchFirst = sc.next();
        searchLast = sc.next();
        for(int i=0;i<n;i++) {
            if (c[i].findFirstName(searchFirst) && c[i].findLastName(searchLast)) {
                c[i] = null;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(c[i]!=null)
                c[i].display();
        }
    }
}
