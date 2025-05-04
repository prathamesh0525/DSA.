package Tree.Types_Of_Tree.Binary.Types_Binary.noOF_Children;
class Node{
    int data;
    Node left,right;
    Node(int val){
        data=val;
        left=right=null;
    }
}
public class Proper_Degenerate {
   
    
        public static void Full_Tree(Node root){
            if(root!=null){
                System.out.println("node "+root.data);
                if (root.left != null && root.right == null) {
                    System.out.println(" -> Left Child: " + root.left.data);
                } else if (root.right != null && root.left == null) {
                    System.out.println(" -> Right Child: " + root.right.data);
                }
                Full_Tree(root.left);
                Full_Tree(root.right);
              
            }
        }
        public static void main(String[] args) {
            Node root=new Node(1);
            Node l1=new Node(2);
            Node l2=new Node(3);
            Node l3=new Node(4);
            Node l4=new Node(5);
            Node l5=new Node(6);
            root.right=l1;
            l1.right=l2;
            l2.left=l3;
            l3.right=l4;
            l4.left=l5;
         Full_Tree(root);
        }  
    }