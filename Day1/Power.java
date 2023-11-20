import java.util.*;
class Power{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double num=0.0,result=0.0;
		for (i = 1; i <= n; i++) {
			num = num + (1 / i);
			result = num;
		}
		System.out.println("Harmonic Value of " + n + " is: " + result);
	}
}