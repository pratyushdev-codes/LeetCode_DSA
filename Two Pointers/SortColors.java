// 75. Sort Colors
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


import java.util.*;

public class SortColors{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr []= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }public  void sortColor(int arr []){
        int n = arr.length;
        int i=0;
        int j=0;
        int k=n-1;

        while(j<=k){
            if(arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
                i++;
            }else if(arr[j]==1){
                j++;
            }else{
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
                k--;
            }
        }
       
        }
    }
