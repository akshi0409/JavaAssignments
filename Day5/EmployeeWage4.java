import java.util.*;
class Company
{
    int wagePerHour = 20, totalWorkingDays = 30,maxhours = 0;
    int empHours = 0;
    Company(int wage,int days,int hrs)
    {
        wagePerHour = wage;
        totalWorkingDays = days;
        maxhours = hrs;
    }
    int findAttendance()
    {
        return (int)Math.floor(Math.random() * 10) % 3;
    }
    int findWage(int empHours)
    {
        return empHours*wagePerHour;
    }
    int findFullTimeMonthlyWage()
    {
        return 8*totalWorkingDays;
    }
    int findPartTimeMonthlyWage()
    {
        return 4*totalWorkingDays;
    }
    void findWage()
    {
        int workingDays=0;
        while(empHours<=maxhours && workingDays<=totalWorkingDays)
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
        System.out.println("The monthly wage of full time employee is: "+findFullTimeMonthlyWage());
        System.out.println("The monthly wage of part time employee is: "+findPartTimeMonthlyWage());
    }
}
class EmployeeWage4
{
    public static void main(String args[])
    {
        int n;
        System.out.println("Welcome to Employee Wage Computation Problem 4");
        System.out.println("Enter the number of companies");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        Company obj[] = new Company[n];
        int wage,days,hrs;
        for(int i=0;i<n;i++) {
            System.out.println("Enter the wage per hour, total working days and maximum number of hours: ");
            wage = sc.nextInt();
            days = sc.nextInt();
            hrs = sc.nextInt();
            obj[i] = new Company(wage,days,hrs);
            obj[i].findWage();
        }
    }
}