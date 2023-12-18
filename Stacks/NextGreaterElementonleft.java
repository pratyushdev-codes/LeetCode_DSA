import java.util.*;

public class NextGreaterElementonleft{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] = new int[n];

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
    }public static int[] nextgreaterelementonLeft(int arr [] , int n ){
        int ans []= new int[n];
        Stack <Integer> st= new Stack<>();
    

        for(int i=n-1;i>0;i--){
            
            while(st.size()>0 && arr[i]> arr[st.peek()]){
                int idx=st.pop();
                ans[idx]= arr[i];
            }
            st.push(i);

        }while(st.size()>0){
            int idx= st.pop();
            ans[idx]=-1;

        }
        return ans;

    }
}