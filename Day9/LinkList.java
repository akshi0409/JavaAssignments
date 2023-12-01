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
    void deleteFirstElement()
    {
        Node temp = head;
        head = temp.link;
        temp = null;
    }
    void deleteLastElement()
    {
        Node temp = head;
        while(temp.link.link!=null)
        {
            temp = temp.link;
        }
        temp.link = null;
    }
    void searchNode(int key)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.value == key)
            {
                System.out.println(key+" is found");
                return;
            }
            temp = temp.link;
        }
        System.out.println(key+" is not found");
    }
    void insertAfterKey(int val,int key)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.value == key)
            {
                Node newNode = new Node(val);
                Node t = temp.link;
                temp.link = newNode;
                newNode.link = t;
                return;
            }
            temp = temp.link;
        }
        System.out.println(key+" is not found");
    }
    void deleteValue(int key)
    {
        Node temp = head;
        while(temp.link!=null)
        {
            if(temp.link.value == key)
            {
                temp.link = temp.link.link;
                return;
            }
            temp = temp.link;
        }
        System.out.println(key+" is not found");
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
        System.out.println("The list after insertion at beginning is: ");
        ll1.printList();
        LinkList ll2 = new LinkList();
        ll2.append(56);
        ll2.append(30);
        ll2.append(70);
        System.out.println("The list after appending items is: ");
        ll2.printList();
        System.out.println("The list after deletion from beginning is: ");
        ll1.deleteFirstElement();
        ll1.printList();
        System.out.println("The list after deletion from end is: ");
        ll2.deleteLastElement();
        ll2.printList();
        ll2.append(70);
        ll2.searchNode(30);
        ll2.searchNode(40);
        System.out.println("The list after inserting value after the key is: ");
        ll2.insertAfterKey(40,30);
        ll2.printList();
        System.out.println("The list after deleting value is: ");
        ll2.deleteValue(40);
        ll2.printList();
    }
}
