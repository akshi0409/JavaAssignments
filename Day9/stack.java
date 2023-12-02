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
    stack()
    {
        head = null;
    }
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
    int peek()
    {
        return head.value;
    }
    int pop()
    {
        stackNode temp = head;
        head = temp.link;
        return temp.value;
    }
    boolean isEmpty()
    {
        return (head == null);
    }
    void display()
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
        stack.display();
        System.out.println("The top element of the stack is: " + stack.peek());
        System.out.println("The element popped from the stack is: "+ stack.pop());
        System.out.println("The element after pop operation is: ");
        stack.display();
        if(stack.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }
}

