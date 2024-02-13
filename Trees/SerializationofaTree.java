import java.util.*;

import javax.swing.tree.TreeNode;


public class SerializationofaTree{
    public static void main(String[] args) {
        
    }class Solution{


        public Sting serizalize(TreeNode root){
            StringBuilder sb = new StringBuilder();
            Helper1(root, sb);
            return sb.toString();

        }public void Helper1(TreeNode root, StringBuilder sb){
            if(root==null){
                sb.append("#");
                return;

            }else{
                sb.append(root.val + "#");
                Helper1(root.left, sb);
                Helper1(root.rigth, sb);
            }
        }

    }
    }
