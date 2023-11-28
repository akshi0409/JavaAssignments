import java.util.*;
interface CompanyStore
{
    public int findAttendance();
    public int calcWage();
    public void findWage();
    public int findFullTimeMonthlyWage();
    public  int findPartTimeMonthlyWage();
}
class EmpCompany implements CompanyStore
{
    int wagePerHour, totalWorkingDays, maxhours;
    int empHours = 0;
    EmpCompany(int wage,int days,int hrs)
    {
        wagePerHour = wage;
        totalWorkingDays = days;
        maxhours = hrs;
    }
    public int findAttendance()
    {
        return (int)Math.floor(Math.random() * 10) % 3;
    }
    public int calcWage()
    {
        return empHours*wagePerHour;
    }
    public int findFullTimeMonthlyWage()
    {
        return 8*totalWorkingDays;
    }
    public int findPartTimeMonthlyWage()
    {
        return 4*totalWorkingDays;
    }
    public void findWage()
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
        System.out.println("The monthly employee wage is: "+ calcWage());
        System.out.println("The monthly wage of full time employee is: "+findFullTimeMonthlyWage());
        System.out.println("The monthly wage of part time employee is: "+findPartTimeMonthlyWage());
    }
}
class EmployeeWage5
{
    public static void main(String args[])
    {
        int n;
        System.out.println("Welcome to Employee Wage Computation Problem 4");
        System.out.println("Enter the number of companies");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        EmpCompany obj[] = new EmpCompany[n];
        int wage,days,hrs;
        for(int i=0;i<n;i++) {
            System.out.println("Enter the wage per hour, total working days and maximum number of hours: ");
            wage = sc.nextInt();
            days = sc.nextInt();
            hrs = sc.nextInt();
            obj[i] = new EmpCompany(wage,days,hrs);
            obj[i].findWage();
        }
    }
}