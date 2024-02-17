import java.util.*;
public class LCAinBST{
    public static void main(String[] args) {
        
    }public class Solution{

        public static Node LCA(Node root, int n1 , int n2){
            if(root==null){
                return null;
            }if(root.val== n1  || root.val ==n2){
                return root;

        } 
        Node left = LCA(root.left , n1 , n2);
        Node right = LCA(root.right, n1, n2);

        if(left!=null && right == null ){
            return left;
        }if(left ==null && right !=null )return right;
        
        return null;
    }

}

}