package trie;

/**
 * First type of TrieElement implementation, which ignores the difference
 * between upper and lower case.
 */
public class Element1 implements TrieElement {

    String s = new String();

    public Element1(String s) {
        this.s = s;
    }

    /**
     * transforms the string into an array of lower case characters
     */
    public char[] toCharArray() {
        return s.toLowerCase().toCharArray();
    }

    public String getString() {
        return s;
    }
}
