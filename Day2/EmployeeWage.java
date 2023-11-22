import java.util.*;
class EmployeeWage
{
	public static void main(String args[])
	{
		int FULL_TIME = 1;
		System.out.println("Welcome to Employee Wage Computation Problem");
		double attd = Math.floor(Math.random() * 10) % 2;
		if(attd == FULL_TIME)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}