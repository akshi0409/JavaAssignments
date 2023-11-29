import java.util.Scanner;

public class printArray {
    public static <E> void PrintArr(E[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the number of values in integer array: ");
        n = sc.nextInt();
        System.out.println("Enter the strings: ");
        Integer[] intArray = new Integer[n];
        for(int i=0;i<n;i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.println("Enter the number of values in double array: ");
        n = sc.nextInt();
        System.out.println("Enter the values: ");
        Double[] doubleArray = new Double[n];
        for(int i=0;i<n;i++) {
            doubleArray[i] = sc.nextDouble();
        }
        System.out.println("Enter the number of values to compare for character: ");
        n = sc.nextInt();
        System.out.println("Enter the chars: ");
        Character[] charArray = new Character[n];
        for(int i=0;i<n;i++) {
            charArray[i] = sc.next().charAt(0);
        }
        System.out.println("The elements of the integer array are: ");
        printArray.PrintArr(intArray);
        System.out.println("The elements of the float array are: ");
        printArray.PrintArr(doubleArray);
        System.out.println("The elements of the character array are: ");
        printArray.PrintArr(charArray);
    }
}
