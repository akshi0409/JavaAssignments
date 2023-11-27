import java.util.*;
public class ReverseNumber
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int reversedNumber  = 0, digit=0;
		while(n>0)
		{
			digit = n%10;
			reversedNumber = reversedNumber*10+digit;
			n = n/10;
		}
		System.out.println("The reversed number is: "+reversedNumber);
	}
}

/*Theory questions:
Uses of static keyword : 
1) Use to refer to common functions without creating objects.
2) For memory management, static variable gets memory only once during loading.
Constructors and its types:
It is a special function used for initializing the class variables. It is called directly when an object of the class is created. IT has same name as the class name.
Types:
Default Constructor : When no constructor is defined, the compiler inserts a constructor on its own.
Unparameterized Constructor : Which does not receive any values as parameters for initialization.
Parameterized Constructor : Which receives values as parameters.
Copy Constructor : Which intializes one object with another object.
*/