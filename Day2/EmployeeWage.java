import java.util.*;
class EmployeeWage
{
	public static void main(String args[])
	{
		int IS_FULL_TIME = 1;
	        int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		System.out.println("Welcome to Employee Wage Computation Problem");
		double empAttendance = Math.floor(Math.random() * 10) % 3;
		int empHours = 0;
		if(empAttendance == IS_FULL_TIME)
		{
			System.out.println("Employee is present and is full time");
			empHours = 8;
		}
		else if(empAttendance == IS_PART_TIME)
		{
			System.out.println("Employee is present and is part time.");
			empHours = 4;
		}
		else
		{
			System.out.println("Employee is absent");
		}
		System.out.println("The employee wage is: "+ empHours*WAGE_PER_HOUR );
	}
}