public class Indexoffirstoccurenceofstring{
    public static void main(String[] args) {
        
    }public class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.isEmpty()) {
                return 0;
            }
    
            if (haystack.length() < needle.length()) {
                return -1;
            }
    
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
    
            return -1;
        }
    }
    
}