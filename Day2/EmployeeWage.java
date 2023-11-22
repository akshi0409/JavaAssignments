import java.util.*;
class EmployeeWage
{
	public static void main(String args[])
	{
		int WAGE_PER_HOUR = 20;
		System.out.println("Welcome to Employee Wage Computation Problem");
		int empAttendance = (int) Math.floor(Math.random() * 10) % 3;
		int empHours = 0;
		switch(empAttendance)
		{
			case 1:
				System.out.println("Employee is present and is full time");
				empHours = 8;
				break;
			case 2:
				System.out.println("Employee is present and is part time.");
				empHours = 4;	
				break;
			default:
				System.out.println("Employee is absent");
		}
		System.out.println("The employee wage is: "+ empHours*WAGE_PER_HOUR );
	}
}