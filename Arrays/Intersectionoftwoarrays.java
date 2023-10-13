public class Intersectionoftwoarrays{
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int ar[]=new int[1001];
            int count=0;
            for(int i =0;i<nums1.length;i++){
                ar[nums1[i]]=1;
            }
            for(int i=0;i<nums2.length;i++){
                if(ar[nums2[i]]==1){
                    ar[nums2[i]]=2;
                    count++;
                }
            }
            int result[]=new int[count];
            int j=0;
            for(int i=0;i<ar.length;i++){
                if(ar[i]==2){
                    result[j]=i;
                    j++;
                }
            }
            return result;
    
          
            
            
        }
    }
}