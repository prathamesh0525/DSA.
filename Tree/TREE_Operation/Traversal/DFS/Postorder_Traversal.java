package Tree.TREE_Operation.Traversal.DFS;
class Node{
    int val;
    Node left,right;
    Node(int data){
        val=data;
        left=right=null;
    }
}
public class Postorder_Traversal {
    
        public  void printPostOrder(Node root){
            if(root==null){
                return;
            }
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.val+" ");
        }
        public static void main(String[] args) {
            Node root=new Node(1);
            Node l1=new Node(2);
            Node r1=new Node(3);
            Node l2=new Node(4);
            Node r2=new Node(5);
            Node l3=new Node(6);
            Node r3=new Node(7);
            Node r4=new Node(8);
            Node l4=new Node(9);
            Node l5=new Node(12);
            Node l6=new Node(14);
            Node l7=new Node(16);
            Node l8=new Node(18);
            Node r5=new Node(10);
            Node r6=new Node(11);
            Node r7=new Node(13);
            Node r8=new Node(15);
            Node r9=new Node(17);
            root.left=l1;
            root.right=r1;
            l1.left=l2;
            l1.right=r2;
            r1.left=l3;
            r1.right=r3;
            l2.right=r4;
            r2.left=l4;
            r2.right=r5;
            l3.right=r6;
            r3.left=l5;
            r3.right=r7;
            r4.left=l6;
            r4.right=r8;
            r5.left=l7;
            r6.right=r9;
            r7.left=l8;
            Postorder_Traversal pt=new Postorder_Traversal();
          pt.printPostOrder(root);
        }
    }
       

