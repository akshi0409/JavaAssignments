import java.util.*;
class SwapNumbers{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number a: ");
		a = sc.nextInt();
		System.out.print("Enter the second number b: ");
		b = sc.nextInt();
		int temp;
		temp = b;
		b = a;
		a = temp;
		System.out.println("The numbers after swapping are: ");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}