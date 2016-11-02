package trie;

/**
 * Represents a node in the trie data structure. It contains a TrieElement object containing
 * the String constructed in that node.
 * A node can have at most ALPHABET_SIZE children.
 */
public class TrieNode {

    private static final int ALPHABET_SIZE = 68;

    public int index = 0;
    public TrieNode[] children;
    public TrieElement element;


    public TrieNode() {
        children = new TrieNode[ALPHABET_SIZE];
    }

    public TrieNode(TrieElement element) {
        this.element = element;
        children = new TrieNode[ALPHABET_SIZE];
    }
}
