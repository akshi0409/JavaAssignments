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
	public static void main(String[] args)
	{
		Uc1_Attendance();
		Uc2_FullTimeWage();
	}
}