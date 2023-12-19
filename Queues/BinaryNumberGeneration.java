import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGeneration {
    public static void main(String[] args) {

        ArrayList<String> binaryNumbers = generate(5);

      
        for (String binaryNumber : binaryNumbers) {
            System.out.println(binaryNumber);
        }
    }


    static ArrayList<String> generate(int N) {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (N-- > 0) {
            String rem = q.remove();
            ans.add(rem);
            q.add(rem + "0");
            q.add(rem + "1");
        }
        return ans;
    }
}
