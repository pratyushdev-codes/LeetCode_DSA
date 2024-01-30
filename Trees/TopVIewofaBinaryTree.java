
import java.util.*;

import javax.print.attribute.HashPrintJobAttributeSet;

import org.w3c.dom.Node;

public class TopVIewofaBinaryTree {
    public static void main(String[] args) {

    }

    public class Pair {
        Node n;
        int vtlevel;

        Pair(Node n1, int x) {
            n = n1;
            vtlevel = x;
        }

        public class solution {
    public static void topView(Node root){
         
    ArrayList<Integer> ans= new ArrayList<>();
    Queue<Pair>  q =new LinkedList<>();
    HashMap<Integer, Integer> hm = new HashMap<>();


    if(root==null){
         return ans;
         
    }
    int min = Integer.MAX_VALUE;
    int max= 0;
    q.add(new Pair(root, 0));


    while(q.size()>0){
        Pair rem =q.remove();
        int  remlevel =rem.vtlevel;
        Node remn = rem.n;

        min = Math.min(remlevel, min);
        max = Math.max(remlevel, max);

        hm.put(remlevel, remn.data);
if(remn.left!null){
    q.add(new Pair(remn.left, remlevel-1));
}
if(remn.right!=null){
    q.add(new Pair (remn.right, remlevel+1));
}
        
    }
for(int i=min; i<max;i++){
    ans.add(hm.get(i));
}


    }

            return ans;

        }

    }
}