import javax.swing.tree.TreeNode;

public class ConstructofTree{
    public static void main(String[] args) {
        
    } 

        public TreeNode buildTree(int[] preorder, int[] inorder) {
             







        }public TreeNode construct(int [] preorder, int ps, int pe, int [] inorder, int  is, int ie){
            if(ps>pe ||is>ie) return null;

        }
        for(int i= is;i<ie;i++ ){
            if(inorder[i]==preorder[ps]){
                int idx= i;
                break;
        }

        int count =idx-is; 


        root.left=construct(preorder,ps+1,ps+count, inorder, is,  idx-1);
        root.right= construct(preorder, ps+co, count, null, count, count))

        
        }
}