import java.util.Arrays;

public class MostCommonWord{
    public static void main(String[] args) {
        
    }class Solution {
    public String mostCommonWord(String p, String[] ban) {
        var e = p.toLowerCase().toCharArray();
        var t = new Trie();
        var res = new char[0];
        int max = 0;
        int l = e.length;

        for (String w : ban) t.addW(w.toCharArray(), 0, true);

        for (int i = 0, j = 0; i < l; j = i) {
            while (i < l && e[i] > 64) i++;
            if (i > j) {
                var w = Arrays.copyOfRange(e, j, i);
                int x = t.addW(w, 0, false);
                if (x > max) {
                    max = x;
                    res = w;
                }
                j = i + 1;
            }
            while (i < l && e[i] < 64) i++;
        }
        return new String(res);
    }
    private static class Trie {
        private int c;
        private final Trie[] t = new Trie[26];

        public int addW(char[] w, int i, boolean ban) {
            if (i == w.length) {
                if (this.c == -1) return -1;
                return ban ? (this.c = -1) : ++this.c;
            }
            int idx = w[i] - 'a';
            if (t[idx] == null) t[idx] = new Trie();
            return t[idx].addW(w, ++i, ban);
        }
    }
}
}