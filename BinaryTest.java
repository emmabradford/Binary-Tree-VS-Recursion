import java.util.Scanner;
/**
 * Write a description of class BinaryTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number for the recursive call");
        int num = in.nextInt();
        System.out.println("Recursive solution");
        int i = secret(num);
        System.out.println(i);
        System.out.println("Binary tree solution");
        BinaryTree test = new BinaryTree(num);
        test.printTree();
        System.out.print("\n");
    }

    public static int secret(int n)
    {
        if(n <= 0)
        {
            return 2;
        }
        else
        {
            return secret(n - 1) + secret(n - 2);
        }
    }
}
