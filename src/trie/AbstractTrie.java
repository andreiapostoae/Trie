package trie;


public interface AbstractTrie {

    void add(TrieElement element);

    int count(TrieElement element);

    void remove(TrieElement element);

    TrieElement[] getSortedElements(TrieElement prefix);

}
