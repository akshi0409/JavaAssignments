import java.util.*;
class LineComparison
{
	static double Uc1_LengthBetweenPoints(int x1,int y1,int x2,int y2)
	{
		double distBetweenPoints = Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2);
		return Math.pow(distBetweenPoints,0.5);
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to Line Comparison Problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates of the first point: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the coordinates of the second point: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double distBetweenPoints = Uc1_LengthBetweenPoints(x1,y1,x2,y2);
		System.out.println("The distance between the points is: "+distBetweenPoints);
	}
}