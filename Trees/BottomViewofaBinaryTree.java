
import java.util.*;

import javax.management.Query;
public class BottomViewofaBinaryTree{
    public static void main(String[] args) {

    }public class Pair{
        Node n;
        int vtlevel;

        Pair(node n1, int x){
            n=n1;
            vtlevel =x;

        }public static void bottomView(Node root){

            ArrayList<Integer> ans = new ArrayList<>();
            Queue<Pair>  q= new LinkedList<>();
            HashMap<Integer,Integer> hm= new HashMap<>();
            if (root == null) return ;
            
            q.add(new Pair(root ,0));
            while(q.size()>0){
                Pair rem = q.remove();

                Node rem = rem.n;
                int vtlevel = rem.vtlevel;
                
                if(rem.left!=null){
                    q.add(new Pair(rem.left, vtlevel-1));

                }if(rem.right!=null){
                }
            }
            return ans;
        }
    }
}