class stackNode
{
    int value;
    stackNode link;
    stackNode(int val)
    {
        this.value = val;
        link = null;
    }
}
public class stack {
    stackNode head;
    void push(int value)
    {
        stackNode n = new stackNode(value);
        if (head == null) {
            head = n;
        }
        else
        {
            n.link = head;
            head = n;
        }
    }
    void printList()
    {
        stackNode temp = head;
        while(temp.link!=null) {
            System.out.print(temp.value+"->");
            temp = temp.link;
        }
        System.out.println(temp.value);
    }
    public static void main(String[] args)
    {
        stack stack = new stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("The stack after push operation: ");
        stack.printList();
    }
}

