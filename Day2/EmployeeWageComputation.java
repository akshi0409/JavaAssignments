import java.util.*;
class EmployeeWageComputation
{
	static void Uc1_Attendance()
	{
		int employeeid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID");
		employeeid = sc.nextInt();
		Random random = new Random();
		boolean attd = random.nextBoolean();
		if(attd)
		{
			System.out.println("The employee is present");
		}
		else
		{
			System.out.println("The employee is absent");
		}
	}
	static void Uc2_FullTimeWage()
	{
		int wagePerHour = 20, workingHours = 8;
		System.out.println("The wage of full time employees is: "+ wagePerHour * workingHours);
	}
	static void Uc3_PartTimeWage()
	{
		int wagePerHour = 20, workingHours = 2;
		System.out.println("The wage of part time employees is: "+ wagePerHour * workingHours);
	}
	static void Uc5_MonthlyWage()
	{
		int wagePerHour = 20, workingHours = 2, noOfDays = 20;
		System.out.println("The monthly wage of part time employees is: "+ wagePerHour * workingHours * noOfDays);
	}
	static void Uc6_EmployeeConditionalWage()
	{
		Scanner sc = new Scanner(System.in);
		int noOfHours;
		System.out.println("Enter the number of hours: ");
		noOfHours = sc.nextInt();
		int wagePerHour = 20;
		if(noOfHours>100)
		{
			System.out.println("Wage of the employee is: "+ 100 * wagePerHour);
		}
		else
		{
			System.out.println("Wage of the employee is: "+ noOfHours * wagePerHour);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to employee computation problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:\n1 for attendance,\n2 for full time wage,\n3 for part time wage,\n5 for monthly wage,\n6 for conditional wage");
		int choice = sc.nextInt(); 
		switch(choice)
		{
		case 1:
			Uc1_Attendance();
			break;
		case 2:
			Uc2_FullTimeWage();
			break;
		case 3:
			Uc3_PartTimeWage();
			break;
		case 5:
			Uc5_MonthlyWage();
			break;
		case 6:
			Uc6_EmployeeConditionalWage();
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}