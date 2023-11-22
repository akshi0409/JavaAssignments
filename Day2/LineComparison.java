import java.util.*;
import java.lang.*;
class LineComparison
{
	static double Uc1_LengthBetweenPoints(int x1,int y1,int x2,int y2)
	{
		double distBetweenPoints = Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2);
		return Math.pow(distBetweenPoints,0.5);
	}
	static boolean Uc2_findEqual(double dist1,double dist2)
	{
		return (dist1 == dist2);
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
		double distBetweenPoints1 = Uc1_LengthBetweenPoints(x1,y1,x2,y2);
		System.out.println("The distance between the points is of first line is: "+distBetweenPoints1);
		System.out.println("Enter the coordinates of the third point: ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.println("Enter the coordinates of the fourth point: ");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		double distBetweenPoints2 = Uc1_LengthBetweenPoints(x3,y3,x4,y4);
		System.out.println("The distance between the points is of second line is: "+distBetweenPoints2);
		boolean isEqual = Uc2_findEqual(distBetweenPoints1,distBetweenPoints2);
		if(isEqual)
		{
			System.out.println("The two lines are equal");
		}
		else
		{
			System.out.println("The two lines are not equal");
		}
	}
}