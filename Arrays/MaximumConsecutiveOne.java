import java.util.Scanner;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxCount = 0;  // Added variable to keep track of maximum consecutive ones

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count = count + 1;
             // Update maxCount if necessary
             i++;
              
            } else {
                count = 0;
                

            }
        }
        return count;  // Return the maximum consecutive ones found
    }
}
