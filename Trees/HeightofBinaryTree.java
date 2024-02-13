public class HeightofBinaryTree{
    public static void main(String[] args) {
        
    }class Solution{
        int height(Node node){


            if(node ==null){
                return 0;
            }
            int lht =height(node.left);
            int rht = height(node.right);


            return Math.max(lht, rht)+1;
        }
    }
}