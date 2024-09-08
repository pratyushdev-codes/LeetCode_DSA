public class ImplementTrie {
    
}class Trie {
    public Trie[] trie; 
    public boolean eow; 

    public Trie() {
        trie = new Trie[26];
        eow = false; 
    }

    public void insert(String word) {
        Trie node = this; 

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int ind = ch - 'a'; 

            if (node.trie[ind] == null) {
                node.trie[ind] = new Trie(); 
            }
            node = node.trie[ind]; 
        }

        node.eow = true; 
    }

    public boolean search(String word) {
        Trie node = this; 

        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';
            if (node.trie[ind] == null) {
                return false; 
            }
            node = node.trie[ind]; 
        }

        return node.eow; 
    }

    public boolean startsWith(String prefix) {
        Trie node = this;

        for (int i = 0; i < prefix.length(); i++) {
            int ind = prefix.charAt(i) - 'a'; 
            if (node.trie[ind] == null) {
                return false; 
            }
            node = node.trie[ind]; 
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

