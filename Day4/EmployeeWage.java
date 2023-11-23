import java.util.*;
class Employee
{
	static final int WAGE_PER_HOUR = 20;
	static final int WORKING_DAYS_COUNT = 30;
	int empHours = 0, workingDays=0, empId = 0;
	Employee(int id)
	{
		empId = id;
	}
	int findAttendance()
	{
		return (int)Math.floor(Math.random() * 10) % 3;
	}
	int findWage(int empHours)
	{
		return empHours*WAGE_PER_HOUR;
	}
	int findMonthlyWage(int empHours)
	{
		return empHours*30;
	}
	void findWage()
	{
		while(empHours<=100 && workingDays<=WORKING_DAYS_COUNT)
		{
			workingDays++;
			switch(findAttendance())
			{
				case 1:
					System.out.println("Employee is present and is full time");
					empHours+=8;
					break;
				case 2:
					System.out.println("Employee is present and is part time.");
					empHours+=4;	
					break;
				default:
					System.out.println("Employee is absent");
			}
		}
		System.out.println("The monthly employee wage is: "+ findWage(empHours));
	}
}
class EmployeeWage
{
	public static void main(String args[])
	{
		int id;
		System.out.println("Welcome to Employee Wage Computation Problem");
		System.out.println("Enter the employee id");
		Scanner sc  = new Scanner(System.in);
		id = sc.nextInt();
		Employee e = new Employee(id);
		e.findWage();
	}
}