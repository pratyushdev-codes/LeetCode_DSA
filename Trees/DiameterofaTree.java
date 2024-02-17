import org.w3c.dom.Node;

public class DiameterofaTree{
    public static void main(String[] args) {
        
    }class Solution {
    // Function to return the diameter of a Binary Tree.
    int ans = 0;
    int diameter(Node root) {
        
        height(root);
        return ans+1;
    }
     int height(Node node) 
    {
        if(node == null) return -1;
        int lht = height(node.left);
        int rht = height(node.right);
        ans = Math.max(ans , lht+rht+2);
        return Math.max(lht,rht)+1;
    }
}

}