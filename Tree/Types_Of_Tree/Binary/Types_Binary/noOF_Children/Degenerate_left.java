package Tree.Types_Of_Tree.Binary.Types_Binary.noOF_Children;
class Node{
    int data;
    Node left,right;
    Node(int val){
        val=data;
        left=right=null;
    }
}
public class Degenerate_left {
        public static void Full_Tree(Node root){
            if(root!=null){
                System.out.println("left side:"+root.data+" "+"right side "+root.right+" ");  
                Full_Tree(root.left);
            }
        }
        public static void main(String[] args) {
            Node root=new Node(1);
            Node l1=new Node(2);
            Node l2=new Node(3);
            Node l3=new Node(4);
            Node l4=new Node(5);
            Node l5=new Node(6);
            root.left=l1;
            l1.left=l2;
            l2.left=l3;
            l3.left=l4;
            l4.left=l5;
         Full_Tree(root);
        }  
    }
