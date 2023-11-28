import java.util.Scanner;

public class Maxmin {
    public static Integer findMax(Integer a, Integer b, Integer c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
            return b;
        else return c;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three values to compare: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Integer n1 = Integer.valueOf(a);
        Integer n2 = Integer.valueOf(b);
        Integer n3 = Integer.valueOf(c);
        System.out.println("The maximum value is: "+findMax(n1,n2,n3));
    }
}
/* Test cases:
Integer:
1- 4 2 3
2- 2 4 3
3- 3 2 4
4- 2 2 2
 */
