import java.util.LinkedList;
import java.util.List;

public class FizzBizz{
    public static void main(String[] args) {
        
    }class Solution {
    public List<String> fizzBuzz(int n) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++)
        {
            if (i % 15 == 0)
                list.add("FizzBuzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(i + "");
        }
        return list;
    }
}
}