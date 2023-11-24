class EmployeeWage1
{
	public static void main(String args[])
	{
		int WAGE_PER_HOUR = 20;
		int WORKING_DAYS_COUNT = 30;
		System.out.println("Welcome to Employee Wage Computation Problem");
		int empHours = 0, workingDays=0;
		while(empHours<=100 && workingDays<=WORKING_DAYS_COUNT)
		{
			workingDays++;
			int empAttendance = (int) Math.floor(Math.random() * 10) % 3;
			switch(empAttendance)
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
		System.out.println("The monthly employee wage is: "+ empHours*WAGE_PER_HOUR );
	}
}