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
          //Test Case 1
          Integer[] intArray1 = {4,2,3,2};
          Float[] floatArray1 = {4.5f,1.2f,3.4f};
          String[] stringArray1 = {"ef","cd","ab"};
          new MaxValue<Integer>(intArray1).findMax();
          new MaxValue<Float>(floatArray1).findMax();
          new MaxValue<String>(stringArray1).findMax();
          //Test Case 2
          Integer[] intArray2 = {4,6,3,2};
          Float[] floatArray2 = {4.5f,7.2f,3.4f};
          String[] stringArray2 = {"ab","yz","cd"};
          new MaxValue<Integer>(intArray2).findMax();
          new MaxValue<Float>(floatArray2).findMax();
          new MaxValue<String>(stringArray2).findMax();
          //Test Case 3
          Integer[] intArray3 = {2,1,3,2};
          Float[] floatArray3 = {4.5f,1.2f,9.4f};
          String[] stringArray3 = {"ab","cd","ef","cw"};
          new MaxValue<Integer>(intArray3).findMax();
          new MaxValue<Float>(floatArray3).findMax();
          new MaxValue<String>(stringArray3).findMax();
    }
}
