
public class InsertinTrie {

public static void main(String[] args) {
    
}class TrieNode{
    TrieNode children =new TrieNode[ALPHABET_SIZE];
    boolean isEndOfWord;

    TrieNode(){
        isEndOfWord= false;
        for(int i = 0 ; i < ALPHABET_SIZE ; i++) = null;
    } 
}




public static insertTrie(TrieNode root , String key){
    TrieNode t = root;

    for(int i = 0 ; i <key.length(); i++){

        if(t.children(ch-'a')==null){
            TrieNode n = new TrieNode();
            t.children(ch-'a')=n;
        }
        t.children(ch-'a')=n; 

    }
    t.isEndOfWord = true;
}
    
}