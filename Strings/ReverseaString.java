public class ReverseaString{
    public static void main(String[] args) {
      public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0 , j = length-1 ; i < length/2  ; i++ , j--)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
}