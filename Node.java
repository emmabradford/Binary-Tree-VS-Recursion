
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
{
    private int val;
    private Node left;
    private Node right;
    private int id;
    
    public Node(int id)
    {
        left = null;
        right = null;
        calc();
        this.id = id;
    }
    
    public void calc()
    {
        if(left != null && right != null)
        {
            val = left.getVal()+ right.getVal();
        } 
        else if(left != null)
        {
            val = 2 + left.getVal();
        }
        else if(right != null)
        {
            val = 2 + right.getVal();
        }
        else 
        {
            val = 2;
        }
    }
    
    public Node getLeft()
    {
        return left;
    }
    
    public Node getRight()
    {
        return right;
    }
    
    public int getVal()
    {
        return val;
    }
    
    public int getID()
    {
        return id;
    }
    
    public void setRight(Node n)
    {
        right = n;
    }
    
    public void setLeft(Node n)
    {
        left = n;
    }
    
    public void setVal()
    {
        this.calc();
    }
}
