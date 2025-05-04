package Tree.TREE_Operation.Traversal.DFS;
class Node{
    int val;
    Node left,right;
    Node(int data){
        val=data;
        left=right=null;

    }
}
public class Preorder_Traversal {
    public static void printPriorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        printPriorder(root.left);
        printPriorder(root.right);
    } 
    public static void main(String[] args) {
        Node root=new Node(1);
        Node l1=new Node(2);
        Node l2=new Node(4);
        Node l3=new Node(7);
        Node r1=new Node(3);
        Node r2=new Node(5);
        Node r3=new Node(6);
        Node r4=new Node(8);
        root.left=l1;
        root.right=r1;
        l1.left=l2;
        l1.right=r2;
        r1.right=r3;
        r2.left=l3;
        r2.right=r4;
        Preorder_Traversal pw=new Preorder_Traversal();
        pw.printPriorder(root);
    }
    
}
