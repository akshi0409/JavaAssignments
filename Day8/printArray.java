public class printArray {
    public static <E> void PrintArr(E[] arr)
    {
        for(E element:arr)
        {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Integer[] intArray = {1,2,5,6};
        Float[] floatArray = {1.4f,4.5f,1.2f,5f};
        Character[] charArray = {'j','a','v','a'};
        printArray.PrintArr(intArray);
        printArray.PrintArr(floatArray);
        printArray.PrintArr(charArray);
    }
}
