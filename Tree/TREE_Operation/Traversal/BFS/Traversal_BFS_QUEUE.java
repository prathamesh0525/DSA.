package Tree.TREE_Operation.Traversal.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left,right;
    Node(int data){
        val=data;
        left=right=null;
    }
}
public class Traversal_BFS_QUEUE {
    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);  

        while (!queue.isEmpty()) {
            Node current = queue.poll();  
            System.out.print(current.val + " ");  

            if (current.left != null) {
                queue.offer(current.left);  
            }

            if (current.right != null) {
                queue.offer(current.right);  
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Traversal_BFS_QUEUE obj = new Traversal_BFS_QUEUE();
        System.out.println("Level Order (BFS) using Queue:");
        obj.levelOrder(root);
    }
}

