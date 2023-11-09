public class isSubsequence{
    public static void main(String[] args) {
        
    }class Solution {
        public boolean isSubsequence(String s, String t) {
            int slen = s.length();
            int tlen = t.length();
            
            if(slen==0)
            return true;
    
            int count=0;
            char c=s.charAt(slen-1-count);
    
            for(int i=tlen-1;i>=0;i--){  
                if(c==t.charAt(i))
                {
                    count++;
                    if(count==slen)
                    return true;
                    c=s.charAt(slen-1-count);
                }
            }
            return false;
        }
    }
}