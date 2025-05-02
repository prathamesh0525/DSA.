package Tree;

public class Create_Node {
    public static Node CreateNode(){
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(4);
        root.right=new Node(3);
        root.left.left=new Node(60);
        return root;

    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val+" ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        Node root=CreateNode();
        System.out.println("inorder travelsal");
        inorder(root);

    }
   
    
}
