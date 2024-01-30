import java.util.*;

public class LeftViewofaTree{
   public static void main(String[] args) {
    
   }class Tree{
       //Function to return list containing elements of left view of binary tree.
       ArrayList<Integer> leftView(Node root)
       {
         ArrayList<Integer> ans = new ArrayList<>();
            Queue<Node> q = new LinkedList<>();
           if(root == null) return ans;
            q.add(root);
            while(q.size() >0){
                int n = q.size();
                for(int i = 1; i<=n; i++){
                    Node temp = q.remove();
                    if(i==1){
                      ans.add(temp.data);
                    }
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
            }
            return ans;
       }
   }
}