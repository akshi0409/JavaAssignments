import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		int year, n;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		str = sc.nextLine();
		year = Integer.parseInt(str);
		n = str.length();
		if (n != 4) {
			System.out.println("enter year as 4 digit number");
			return;
		}
		else {
			if (year % 400 == 0 && year % 100 == 0)
				System.out.println("Year " + year + " is a leap year");
			else if (year % 100 != 0 && year % 4 == 0)
				System.out.println("Year " + year + " is a leap year");
			else
				System.out.println("Year " + year + " is not a leap year");
		}

	}

}