package Tree.TREE_Operation.Traversal.BFS;
import java.util.*;
class Node{
    int val;
    Node left,right;
    Node(int data){
        val=data;
        left=right=null;
    }
}
public class Travalsal_BFS {
    public void recursion(Node root,int level,List<List<Integer>>res){
        if(root==null){
            return;
        }
        if(res.size()<=level){

            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        recursion(root.left,level+1,res);
        recursion(root.right,level+1,res);

    }
   public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>>res=new ArrayList<>();
        recursion(root,0,res);
        return res;



    }
   
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Travalsal_BFS obj = new Travalsal_BFS();
        List<List<Integer>> result = obj.levelOrder(root);

        // Print level order result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
        
    }

   
    
}
