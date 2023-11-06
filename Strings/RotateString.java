public class RotateString{
    public static void main(String[] args) {
        
    }class Solution {
        public boolean rotateString(String s, String goal) {
            StringBuilder sb=new StringBuilder(s);
            int i=0;
           while(i<s.length()) 
           {
               char ch=sb.charAt(0);
               sb.deleteCharAt(0);
               sb.append(ch);
               if(sb.toString().equals(goal))
               return true;
               i++;
           }
           return false;
        }
    }
}