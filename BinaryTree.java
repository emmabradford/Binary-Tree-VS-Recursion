
/**
 * Write a description of class BinaryTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryTree
{
    Node root;

    public BinaryTree(int a)
    {
        root = new Node(a);
        generate(a);
        setVals(root);
    }

    public void generate(int a)
    {
        Node curr = root;
        while(a > 0)
        {
            add(a);
            a--;
        }
    }

    public void add(int a)
    {
        root = addRecursive(root, a);
    }

    public Node addRecursive(Node curr, int a)
    {
        if(curr == null )
        {
            return new Node(a);
        }
        else
        {
            if(curr.getID()== 0)
            {
                return new Node(0);
            }
            else if (curr.getID()== -1)
            {
                return new Node(-1);
            }
            else
            {
                curr.setLeft(addRecursive(curr.getLeft(), curr.getID()-1));
                curr.setRight(addRecursive(curr.getRight(), curr.getID()-2));
            }
        }
        return curr;
    }

    public void printTree()
    {
        printTreeUntil(root, 0);
    }

    public void setVals(Node n)// this is a post order traversal
    {
        if(n == null)
        {
            return;
        }
        setVals(n.getLeft());
        setVals(n.getRight());
        n.setVal();
    }

    public void printTreeUntil(Node r, int s)//this is the oposite of an in order traverse
    {
        if(r == null)
        {
            return;
        }
        s += 10;
        printTreeUntil(r.getRight(), s);
        System.out.print("\n");
        for(int i = 10; i < s; i++)
        {
            System.out.print(" ");
        }
        System.out.print(r.getID() + ": " + r.getVal());
        printTreeUntil(r.getLeft(), s);
    }
}
