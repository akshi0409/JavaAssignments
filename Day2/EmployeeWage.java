import java.util.*;
class EmployeeWage
{
	public static void main(String args[])
	{
		int FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		System.out.println("Welcome to Employee Wage Computation Problem");
		double empAttendance = Math.floor(Math.random() * 10) % 2;
		int empHours = 0;
		if(empAttendance == FULL_TIME)
		{
			System.out.println("Employee is present");
			empHours = 8;
		}
		else
		{
			System.out.println("Employee is absent");
		}
		System.out.println("The employee wage is: "+ empHours*WAGE_PER_HOUR );
	}
}