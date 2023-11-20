import java.util.*;
class PrimeFactors{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				n = n/i;
			}
		}
	}

}