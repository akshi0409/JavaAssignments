import java.util.Scanner;

public class MaxValue <E extends Comparable<E>>{
    E a[];
    MaxValue(E a[])
    {
        this.a = a;
    }
    public void findMax()
    {
        findMax(a);
    }
    public static <E extends Comparable<E>> void findMax(E a[])
    {
        E max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i].compareTo(max)>0)
                max=a[i];
        }
        printMax(max);
    }
    public static <E> void printMax(E max)
    {
        System.out.println("The max value is: "+max);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number of values to compare for integer: ");
        n = sc.nextInt();
        System.out.println("Enter the strings: ");
        Integer[] intArray = new Integer[n];
        for(int i=0;i<n;i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.println("Enter the number of values to compare for float: ");
        n = sc.nextInt();
        System.out.println("Enter the values: ");
        Float[] floatArray = new Float[n];
        for(int i=0;i<n;i++) {
            floatArray[i] = sc.nextFloat();
        }
        System.out.println("Enter the number of values to compare for string: ");
        n = sc.nextInt();
        System.out.println("Enter the strings: ");
        String[] stringArray = new String[n];
        for(int i=0;i<n;i++) {
            stringArray[i] = sc.next();
        }
        new MaxValue<Integer>(intArray).findMax();
        new MaxValue<Float>(floatArray).findMax();
        new MaxValue<String>(stringArray).findMax();
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
