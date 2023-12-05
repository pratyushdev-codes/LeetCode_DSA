import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int heights[] = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        LargestRectangleHistogram solution = new LargestRectangleHistogram();
        int result = solution.largestRectangleArea(heights);
        System.out.println(result);
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();

        int ans = Integer.MIN_VALUE;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[i] < heights[s.peek()]) {
                int ths = s.pop();
                int nsr = i;
                int x1 = nsr - 1;
                int nsl = -1;

                if (!s.isEmpty()) {
                    nsl = s.peek();
                }

                int x2 = nsl + 1;
                int area = heights[ths] * (x2 - x1 + 1);
                ans = Math.max(ans, area);
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            int ths = s.pop();
            int nsr = n;
            int x1 = nsr - 1;
            int nsl = -1;

            if (!s.isEmpty()) {
                nsl = s.peek();
            }

            int x2 = nsl + 1;
            int area = heights[ths] * (x2 - x1 + 1);
            ans = Math.max(ans, area);
        }

        return ans;
    }
}
