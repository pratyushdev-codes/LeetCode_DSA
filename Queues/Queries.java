import java.util.Scanner;
import java.util.TreeSet;

public class Queries {
    static TreeSet<Integer> set = new TreeSet<>(); // Moved set to a class-wide scope

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = NoName(n); // Call NoName function to get the ans array

        // You may want to add code to print or use the 'ans' array here
    }

    public static int[] NoName(int n) {
        int[] ans = new int[n];

        // You might want to add some logic to fill the 'ans' array here

        return ans;
    }

    public static void Type1(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // Fixed the loop condition
            if (arr[i] == 0) {
                arr[i] = 1;
                set.add(i);
            } else {
                arr[i] = 0;
                set.remove(i); // Changed '1' to 'i' to remove the correct element
            }
        }
    }

    public static int Type2(int i) { // Changed return type to 'int'
        int rightnearest = set.ceiling(i);
        int leftnearest = set.floor(i);

        int leftdist = i - leftnearest;
        int rightdist = rightnearest - i;

        if (leftdist <= rightdist) {
            return leftdist;
        } else {
            return rightdist;
        }
    }
}
