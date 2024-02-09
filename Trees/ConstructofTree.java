import javax.swing.tree.TreeNode;

public class ConstructofTree {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length)
            return null;

        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode construct(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps > pe || is > ie)
            return null;

        int rootValue = preorder[ps]; // Root value is the first element in preorder
        TreeNode root = new TreeNode(rootValue);

        int idx = 0;
        for (int i = is; i <= ie; i++) {
            if (inorder[i] == rootValue) {
                idx = i;
                break;
            }
        }

        int count = idx - is;

        root.left = construct(preorder, ps + 1, ps + count, inorder, is, idx - 1);
        root.right = construct(preorder, ps + count + 1, pe, inorder, idx + 1, ie);

        return root;
    }
}
