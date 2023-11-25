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