class QueueNode
{
    int value;
    QueueNode link;
    QueueNode(int val)
    {
        this.value = val;
        link = null;
    }
}
public class queue {
    QueueNode head;
    void enqueue(int value)
    {
        QueueNode n = new QueueNode(value);
        if(head == null)
            head = n;
        else
        {
            QueueNode temp = head;
            while(temp.link!=null)
            {
                temp=temp.link;
            }
            temp.link = n;
        }
    }
    int dequeue()
    {
        QueueNode temp = head;
        head = temp.link;
        return temp.value;
    }
    void printList()
    {
        QueueNode temp = head;
        while(temp.link!=null) {
            System.out.print(temp.value+"->");
            temp = temp.link;
        }
        System.out.println(temp.value);
    }
    public static void main(String[] args)
    {
        queue q = new queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        System.out.println("The list after enqueue operation");
        q.printList();
        q.dequeue();
        System.out.println("The list after dequeue operation");
        q.printList();
    }
}


