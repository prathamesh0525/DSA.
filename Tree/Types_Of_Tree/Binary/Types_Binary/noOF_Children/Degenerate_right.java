package Tree.Types_Of_Tree.Binary.Types_Binary.noOF_Children;


class Node{
    int data;
    Node left,right;
    Node(int val){
        data=val;
        left=right=null;
    }
}
    public class Degenerate_right {
    
        public static void Full_Tree(Node root){
            if(root!=null){
                System.out.println("right side:"+root.data+" "+"left side "+root.left+" ");  
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
            l2.right=l3;
            l3.right=l4;
            l4.right=l5;
         Full_Tree(root);
        }  
    }

    

