import java.util.*;
class Power{
	public static void main(String[] args)
	{
		int num, nextValue = 1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num > 31) {
			System.out.println("Value out of range");
			return;
		}
		else {
			System.out.println(nextValue);
			for (int j = 1; j <= num; j++) {
				nextValue = nextValue * 2;
				if(nextValue<=Math.pow(2,num))
				{
					System.out.println(nextValue);
				}
			}
		}
	}
}
