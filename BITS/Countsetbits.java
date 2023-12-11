import java.util.Scanner;

public class Countsetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = countsetbits(n);

        System.out.println("Number of set bits: " + count);
    }

    public static boolean checkithbit(int i, int n) {
        return (n & (1 << i)) != 0;
    }

    public static int countsetbits(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) { // Assuming 32-bit integers
            if (checkithbit(i, n)) {
                count++;
            }
        }
        return count;
    }
}
