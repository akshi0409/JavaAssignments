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
          //TC1
          Integer[] intArray1 = {4,2,3,2};
          Float[] floatArray1 = {4.5f,1.2f,3.4f};
          String[] stringArray1 = {"ef","cd","ab"};
          new MaxValue<Integer>(intArray1).findMax();
          new MaxValue<Float>(floatArray1).findMax();
          new MaxValue<String>(stringArray1).findMax();
          //TC2
          Integer[] intArray2 = {4,6,3,2};
          Float[] floatArray2 = {4.5f,7.2f,3.4f};
          String[] stringArray2 = {"ab","yz","cd"};
          new MaxValue<Integer>(intArray2).findMax();
          new MaxValue<Float>(floatArray2).findMax();
          new MaxValue<String>(stringArray2).findMax();
          //TC3
          Integer[] intArray3 = {2,1,3,2};
          Float[] floatArray3 = {4.5f,1.2f,9.4f};
          String[] stringArray3 = {"ab","cd","ef"};
          new MaxValue<Integer>(intArray3).findMax();
          new MaxValue<Float>(floatArray3).findMax();
          new MaxValue<String>(stringArray3).findMax();
//        Code for program using user input:
 //        Scanner sc= new Scanner(System.in);
//        int n;
//        System.out.println("Enter the number of values to compare for integer: ");
//        n = sc.nextInt();
//        System.out.println("Enter the strings: ");
//        Integer[] intArray = new Integer[n];
//        for(int i=0;i<n;i++) {
//            intArray[i] = sc.nextInt();
//        }
//        System.out.println("Enter the number of values to compare for float: ");
//        n = sc.nextInt();
//        System.out.println("Enter the values: ");
//        Float[] floatArray = new Float[n];
//        for(int i=0;i<n;i++) {
//            floatArray[i] = sc.nextFloat();
//        }
//        System.out.println("Enter the number of values to compare for string: ");
//        n = sc.nextInt();
//        System.out.println("Enter the strings: ");
//        String[] stringArray = new String[n];
//        for(int i=0;i<n;i++) {
//            stringArray[i] = sc.next();
//        }
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
