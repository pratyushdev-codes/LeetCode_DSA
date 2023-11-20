
import java.util.*;
public class MergeTwoSortedSubarray{
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first Array:");
    
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
    
            =
    
            int[] result = MergeTwoSortedArray(a,b);
            // Print the merged array
            for (int i : result) {
                System.out.print(i + " ");
            }
        }public static int mergesortedSubarrays(int a [] , int b []){
            int n=a.length;
            int m=b.length;

            int [] c= new int[n+m];
            int p1=0;
            int p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]){
                c[p3]

        }


        }

    }
