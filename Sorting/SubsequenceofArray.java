import java.util.*;

public class SubsequenceofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> subsequences = subsequenceArray(arr);

        // Print the subsequences
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    public static List<List<Integer>> subsequenceArray(int arr[]) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        // Generate all possible subsequences
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (checkBit(i, j)) {
                    temp.add(arr[j]);
                }
            }
            ans.add(temp);
        }

        return ans;
    }

    // Function to check if the j-th bit in the binary representation of num is set
    private static boolean checkBit(int num, int j) {
        return (num & (1 << j)) != 0;
    }
}
