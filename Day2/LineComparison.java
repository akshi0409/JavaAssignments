import java.util.*;
import java.lang.*;
class LineComparison
{
	static double Uc1_LengthBetweenPoints()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x coordinate of point: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the y coordinate of point: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double distBetweenPoints = Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2);
		return Math.pow(distBetweenPoints,0.5);
	}
	static boolean Uc2_findEqual(double dist1,double dist2)
	{
		String d1 = Double.toString(dist1);
		String d2 = Double.toString(dist2);
		if(d1.equals(d2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static void Uc3_compareLengths(double dist1,double dist2)
	{
		String d1 = Double.toString(dist1);
		String d2 = Double.toString(dist2);
		if(d1.compareTo(d2)>0)
		{
			System.out.println("First line is greater than second");
		}
		else
		{
			System.out.println("Second line is greater than first");
		}
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to Line Comparison Problem");
		double distBetweenPoints1 = Uc1_LengthBetweenPoints();
		System.out.println("The distance between the points is of first line is: "+distBetweenPoints1);
		double distBetweenPoints2 = Uc1_LengthBetweenPoints();
		System.out.println("The distance between the points is of second line is: "+distBetweenPoints2);
		boolean isEqual = Uc2_findEqual(distBetweenPoints1,distBetweenPoints2);
		if(isEqual)
		{
			System.out.println("The two lines are equal");
		}
		else
		{
			Uc3_compareLengths(distBetweenPoints1,distBetweenPoints2);
		}
	}
}