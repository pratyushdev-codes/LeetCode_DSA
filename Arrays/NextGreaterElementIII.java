import java.util.Arrays;

public class NextGreaterElementIII{
    public static void main(String[] args) {
        
    }class Solution {
    public int nextGreaterElement(int n) {
        char[] number = (n+"").toCharArray();

        int idx = -1;
        for(int i = number.length - 2; i>=0;i--){
            if(number[i] < number[i+1]){
                idx = i;
                break;
            }
        }    

        if(idx == -1){
            return -1;
        }

        int val = number[idx];
        int smallest = idx+1;

        for(int j = idx+1;j<number.length;j++){
            if(number[j] > val && number[j] <= number[smallest]){
                smallest = j;
            }
        }

        char temp = number[idx];
        number[idx] = number[smallest];
        number[smallest] = temp;

        Arrays.sort(number,idx+1,number.length);

        long ans = Long.parseLong(new String(number));

        if(ans > Integer.MAX_VALUE){
            return -1;
        }else{
            return (int)ans;
        }

    }

    
}

    

}