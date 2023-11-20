import java.util.*;
class FlipCoin
{
	public static void main(String args[])
	{
		double heads = 0,tails = 0;
		int headsCount=0,tailsCount=0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			double randomNumber = Math.random();
			if (randomNumber < 0.5)
				tailsCount++;
			else
				headsCount++;
		}
		heads = headsCount / (double) n * 100;
		tails = tailsCount / (double) n * 100;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");
	}
}