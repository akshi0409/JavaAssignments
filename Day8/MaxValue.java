public class MaxValue <E extends Comparable<E>>{
    E a,b,c;
    MaxValue(E a, E b, E c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public E findMax()
    {
        return findMax(a,b,c);
    }
    public static <E extends Comparable<E>> E findMax(E a, E b, E c)
    {
        E max = a;
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
        Integer valueI1 = 5,valueI2=6,valueI3=7;
        Float valueF1 = 1.5f, valueF2 = 1.2f, valueF3 = 5.6f;
        String valueS1 = "ab",valueS2 = "cz", valueS3 = "ef";
        System.out.println("The max integer is : "+ new MaxValue<Integer>(valueI1,valueI2,valueI3).findMax());
        System.out.println("The max float is : "+ new MaxValue<Float>(valueF1,valueF2,valueF3).findMax());
        System.out.println("The max string is : "+ new MaxValue<String>(valueS1,valueS2,valueS3).findMax());
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
