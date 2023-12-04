class MyBinaryNode
{
    MyBinaryNode left;
    MyBinaryNode right;
    int val;
    MyBinaryNode(int value)
    {
        val = value;
        left = null;
        right = null;
    }
}
public class BST {
    MyBinaryNode root;
    BST()
    {
        root = null;
    }
    void addValue(int value)
    {
        MyBinaryNode newNode = new MyBinaryNode(value);
        if(root == null)
        {
            root = newNode;
            return;
        }
        MyBinaryNode temp = root;
        MyBinaryNode prev = null;
        while(temp!=null)
        {
            if(value<temp.val)
            {
                prev = temp;
                temp = temp.left;
            }
            else
            {
                prev = temp;
                temp = temp.right;
            }
        }
        if(prev.val>value)
        {
            prev.left = newNode;
        }
        else
        {
            prev.right = newNode;
        }
    }
    void display(MyBinaryNode temp)
    {
        if(temp==null)
            return;
        display(temp.left);
        System.out.print(temp.val+" ");
        display(temp.right);
    }
    public static void main(String[] args)
    {
        BST bst = new BST();
        bst.addValue(56);
        bst.addValue(30);
        bst.addValue(70);
        bst.display(bst.root);
        System.out.println();

    }
}
