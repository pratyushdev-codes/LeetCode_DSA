import java.util.*;

public class SingleElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 1, 1};
        int result = singleElement(arr);
        System.out.println("The element that appears only once is: " + result);
    }

    public static int singleElement(int arr[]) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
