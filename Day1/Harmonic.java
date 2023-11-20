import java.util.*;
class Harmonic
{
	public static void main(String arg[])
	{
		int n;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double sum=0.0;	
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1.0/i);
		}
		System.out.println("Harmonic value = "+sum);
	}
}