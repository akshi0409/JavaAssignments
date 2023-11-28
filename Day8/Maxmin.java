import java.util.Scanner;

public class Maxmin {
    public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (a.compareTo(max) > 0)
            max = a;
        if (b.compareTo(max)>0)
            max = b;
        if (c.compareTo(max)>0)
            max=c;
        return max;
    }
    public static Float findMax(Float a, Float b, Float c) {
        Float max = a;
        if (a.compareTo(max) > 0)
            max = a;
        if (b.compareTo(max)>0)
            max = b;
        if (c.compareTo(max)>0)
            max=c;
        return max;
    }
    public static String findMax(String a, String b, String c)
    {
        String max = a;
        if (a.compareTo(max) > 0)
            max = a;
        if (b.compareTo(max)>0)
            max = b;
        if (c.compareTo(max)>0)
            max=c;
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three values to compare: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Integer valueI1 = Integer.valueOf(a);
        Integer valueI2 = Integer.valueOf(b);
        Integer valueI3 = Integer.valueOf(c);
        System.out.println("The maximum value is: "+findMax(valueI1,valueI2,valueI3));
        float a1,b1,c1;
        System.out.println("Enter the three values to compare: ");
        a1 = sc.nextFloat();
        b1 = sc.nextFloat();
        c1 = sc.nextFloat();
        Float valueF1 = Float.valueOf(a1);
        Float valueF2 = Float.valueOf(b1);
        Float valueF3 = Float.valueOf(c1);
        System.out.println("The maximum value is: "+findMax(valueF1,valueF2,valueF3));
        String valueS1,valueS2,valueS3;
        System.out.println("Enter the strings to compare: ");
        valueS1 = sc.next();
        valueS2 = sc.next();
        valueS3 = sc.next();
        System.out.println("The maximum value is: "+findMax(valueS1,valueS2,valueS3));

    }
}
/* Test cases:
Integer:
1- 4 2 3
2- 2 4 3
3- 3 2 4
4- 2 2 1
5- 2 2 2
Float:
1- 5.6 1.2 3.4
2- 1.7 7.8 2.3
3- 2.3 4.5 8.9
4- 1.2 1.2 1.2
5- 2.3 2.3 1.4
String:
1- ab cd ef
2- ab ef cd
3- ef ab cd
4- ab ab ab
5- cd cd ef
 */
