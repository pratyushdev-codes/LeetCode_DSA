import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public class insertinBST {

    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            TreeNode n = new TreeNode(val);
            if(root == null) return n;
            TreeNode ans = root;
            while(true){
                if(root.val > val){
                  if(root.left == null) {
                      root.left = n;
                      return ans;
                  } else{
                      root = root.left;
                  }
                } else {
                   if(root.right == null){
                       root.right = n;
                       return ans;
                   } else {
                       root = root.right;
                   }
                    
                }
            }
        }
    }
    
}