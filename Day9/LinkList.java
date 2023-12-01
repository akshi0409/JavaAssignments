class Node
{
    int value;
    Node link;
    Node(int val)
    {
        this.value = val;
        link = null;
    }
}
public class LinkList {
    Node head;
    void insertAtBegin(int value)
    {
        Node n = new Node(value);
        if (head == null) {
            head = n;
        }
        else
        {
            n.link = head;
            head = n;
        }
    }
    void append(int value)
    {
        Node n = new Node(value);
        if(head == null)
            head = n;
        else
        {
            Node temp = head;
            while(temp.link!=null)
            {
                temp=temp.link;
            }
            temp.link = n;
        }
    }
    void printList()
    {
        Node temp = head;
        while(temp.link!=null) {
            System.out.print(temp.value+"->");
            temp = temp.link;
        }
        System.out.println(temp.value);
    }
    public static void main(String[] args)
    {
        LinkList ll1 = new LinkList();
        ll1.insertAtBegin(70);
        ll1.insertAtBegin(30);
        ll1.insertAtBegin(56);
        ll1.printList();
        LinkList ll2 = new LinkList();
        ll2.append(56);
        ll2.append(30);
        ll2.append(70);
        ll2.printList();
    }
}
