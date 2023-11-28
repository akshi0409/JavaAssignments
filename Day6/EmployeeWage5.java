import java.util.*;
interface CompanyStore
{
    public int findAttendance();
    public void findWage();
    public int findFullTimeMonthlyWage();
    public  int findPartTimeMonthlyWage();
}
class EmpCompany implements CompanyStore
{
    int wagePerHour,totalWorkingDays,maxHours,totalEmpWage;
    String company;
    int empHours = 0;
    EmpCompany(String name,int wage,int days,int hrs)
    {
        this.company = name;
        this.wagePerHour = wage;
        this.totalWorkingDays = days;
        this.maxHours = hrs;
        totalEmpWage = 0;
    }
    int getTotalWage()
    {
        return totalEmpWage;
    }
    public int findAttendance()
    {
        return (int)Math.floor(Math.random() * 10) % 3;
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
        while(empHours<=maxHours && workingDays<=totalWorkingDays)
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
        totalEmpWage = empHours*wagePerHour;
        System.out.println("The monthly employee wage is: "+ totalEmpWage + " for company: "+company);
        System.out.println("The monthly wage of full time employee is: "+findFullTimeMonthlyWage());
        System.out.println("The monthly wage of part time employee is: "+findPartTimeMonthlyWage());
    }
}
class EmployeeWage5
{
    LinkedList<EmpCompany>CompaniesList;
    Map<String,EmpCompany>CompaniesMap;
    EmployeeWage5()
    {
        CompaniesList = new LinkedList<>();
        CompaniesMap = new HashMap<>();
    }
    void addCompany(String company,int wage, int days,int hrs)
    {
        EmpCompany c = new EmpCompany(company,wage,days,hrs);
        CompaniesList.add(c);
        CompaniesMap.put(company,c);
    }
    void computeWage()
    {
        for(int i=0;i<CompaniesList.size();i++)
        {
            EmpCompany comp = CompaniesList.get(i);
            comp.findWage();
        }
    }
    int getWage(String name)
    {
        return (CompaniesMap.get(name)).getTotalWage();
    }
    public static void main(String args[])
    {
        int n;
        System.out.println("Welcome to Employee Wage Computation Problem 4");
        EmployeeWage5 builder = new EmployeeWage5();
        System.out.println("Enter the number of companies");
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        int wage,days,hrs;
        String name;
        for(int i=0;i<n;i++) {
            System.out.println("Enter the name,wage per hour, total working days and maximum number of hours: ");
            name = sc.next();
            wage = sc.nextInt();
            days = sc.nextInt();
            hrs = sc.nextInt();
            builder.addCompany(name,wage,days,hrs);
        }
        builder.computeWage();
    }
}