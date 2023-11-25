public class ContainerwithMostWater{
    public static void main(String[] args) {
        //BoilerPlate code



        int result = conatianerwithmostWater(arr[]);
    }public static int conatianerwithmostWater(int arr []){
        int i=0;
        int j=0;
        int ans= Integer.MIN_VALUE;

        int width= (j-1)*Math.min(i,j);
        
        while(i<j){

            ans = Math.max(ans , width);

            if(arr[i]<=arr[j]){
                i++;
            }else{
                j++;
            }
            return ans;
        }
    }
    }
