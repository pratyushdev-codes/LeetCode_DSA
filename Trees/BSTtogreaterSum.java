import java.uti.*;

public class BSTtogreaterSum{
    public static void main(String[] args) {
         
    }class Solution {
        int greater=0;
        public TreeNode bstToGst(TreeNode root) {
            helper(root);
            return root;
        }
        public void helper(TreeNode root){
            if(root == null) return;
            helper(root.right);
            greater = greater + root.val;
            root.val = greater;
            helper(root.left);
            
        }
    }
}    