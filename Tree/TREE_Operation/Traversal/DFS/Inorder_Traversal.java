package Tree.TREE_Operation.Traversal.DFS;
class Node{
    int val;
    Node left,right;
    Node(int data){
        val=data;
        left=right=null;
    }
}
public class Inorder_Traversal {
    public static void inorder_Traversal(Node root){
        if(root==null){
            return;
        }
        inorder_Traversal(root.left);
        System.out.print(root.val+" ");
        inorder_Traversal(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node l1=new Node(2);
        Node l2=new Node(4);
        Node l3=new Node(7);
        Node l4=new Node(9);
        Node r1=new Node(3);
        Node r2=new Node(5);
        Node r3=new Node(6);
        Node r4=new Node(8);
        Node r5=new Node(10);
        root.left=l1;
        root.right=r1;
        l1.left=l2;
        l1.right=r2;
        r1.right=r3;
        r2.left=l3;
        r2.right=r4;
        r4.left=l4;
        l4.right=r3.left=r5;
        inorder_Traversal(root);

    }
    
}
