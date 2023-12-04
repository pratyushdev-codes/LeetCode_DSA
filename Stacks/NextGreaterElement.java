import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = nextgreaterElement(arr);

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] nextgreaterElement(int[] arr) {
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }

        while (st.size() > 0) {
            int idx = st.pop();
            ans[idx] = -1;
        }

        return ans;
    }
}
