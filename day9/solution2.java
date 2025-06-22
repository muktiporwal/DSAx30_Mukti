import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution2 {
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result= new ArrayList<>();
        inorderHelper(root,result);
        return result;
    }
    public static void inorderHelper(TreeNode node, List<Integer> result){
        if(node==null)
            return;
        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of root: ");
        int r=sc.nextInt();
        System.out.println("Enter the value of right element: ");
        int rt=sc.nextInt();
        System.out.println("Enter the value of left: ");
        int l=sc.nextInt();
        TreeNode root=new TreeNode(r);
        root.right= new TreeNode(rt);
        root.right.left=new TreeNode(l);

        List<Integer> result= inorderTraversal(root);
        System.out.println(result);
    }
}
