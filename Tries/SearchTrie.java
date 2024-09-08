import InsertinTrie.TrieNode;

/**
 * SearchTrie
 */

public class SearchTrie {

public static void main(String[] args) {
    
}public static boolean searchTrie( TrieNode root , String key){
    TrieNode t = root;

    for(int i =0 ; i< key.length() ; i++){
       char ch = key.charAt(i);
       if(t.children[ch-'a'] != null){
        t = t.children[ch-'a'];

    }else{
        return false;
    }

}
    return t.isEndOfWord;
}

}