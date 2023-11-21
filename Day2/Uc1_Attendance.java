import java.util.*;
class Uc1_Attendance
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
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
}