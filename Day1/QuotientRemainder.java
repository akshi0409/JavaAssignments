import java.util.*;
class QuotientRemainder{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		a = sc.nextInt();
		System.out.print("Enter the divisor: ");
		b = sc.nextInt();
		System.out.println("The quotient is: "+(a/b));
		System.out.println("The remainder is: "+(a%b));
	}
}
