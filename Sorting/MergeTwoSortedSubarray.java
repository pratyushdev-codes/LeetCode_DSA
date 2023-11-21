
import java.util.*;
public class MergeTwoSortedSubarray{
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first Array:");
    
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
    
            int s=sc.nextInt();
            int m =sc.nextInt();
            int e=sc.nextInt();
            
    
           
        
        }public static int [] mergesortedSubarrays(int arr [], int s, int m , int e){
            int temp []= new int[e-s+1];
          int P1=s;
          int P2=m+1;
          int P3=e;                                 

          while(P1<m && P2<e){

        if(arr[P1]<arr[P2]){
temp[P3]=arr[P1];
P3++;
P1++;
        }else{
            temp[P3]=arr[P2];
            P3++;
            P2++;
        }
          }

          while(P1<m){
            temp[P3]=arr[P1];
            P3++;
P1++;
          }
            while(P2<e){
                temp[P3]=arr[P2];
                P3++;
                P2++;
            }
        }

return temp;
        }

    
