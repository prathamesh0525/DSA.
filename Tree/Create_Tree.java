package Tree;

public class Create_Tree {
    Node root;
    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.Left);
        System.out.print(node.val + " ");
        inorder(node.Right);
    }
    public static void main(String[] args) {
        Create_Tree node=new Create_Tree();
        node.root=new Node(1);
        node.root.Left=new Node(2);
        node.root.Right = new Node(3);     
        node.root.Left.Left=new Node(5);
        node.root.Right.Left=new Node(6);
        System.out.println("Inorder Traversal of Tree:");
        node.inorder(node.root);
      
    }
    
}
