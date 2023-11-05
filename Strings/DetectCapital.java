public class DetectCapital{
    public static void main(String[] args) {
        
    }class Solution {
        public boolean detectCapitalUse(String word) {
            if (word.length() == 1) return true;
    
            for (int i = 0; i < word.length(); ) {
                if (Character.isLowerCase(word.charAt(i))) {
                    while (i < word.length()) {
                        if (!Character.isLowerCase(word.charAt(i++))) return false;
                    }
                }else if (Character.isUpperCase(word.charAt(++i))){
                    while (i < word.length()) {
                        if (!Character.isUpperCase(word.charAt(i++))) return false;
                    }
                }
            }
    
            return true;
        }
    }
}