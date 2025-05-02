package Tree.Types_Of_Tree.Binary.Types_Binary.noOF_Children;


class Node{
    int data;
    Node left,right;
    Node(int val){
        data=val;
        left=right=null;
    }

}
public class Full_Binary {
    public static void Full_Tree(Node root){
        if(root!=null){
            
            System.out.print(root.data+" ");  
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
       
        Node r1=new Node(7);
        Node r2=new Node(8);
        Node r3=new Node(9);
        Node r4=new Node(15);
        Node r5=new Node(26);
       
        root.left=l1;
        root.right=r1;
        l1.left=l2;
        l1.right=r2;
        r1.left=l3;
        r1.right=r3;
        l2.left=l4;
        l2.right=r4;
        r2.left=l5;
        r2.right=r5;
     Full_Tree(root);
    
    }
    
}

    


    

