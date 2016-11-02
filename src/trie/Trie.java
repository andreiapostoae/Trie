package trie;

/**
 * Trie data structure implementation. Every node has ALPHABET_SIZE nodes and the
 * position of a node in its parent's children array represents the character.
 * Contains 4 methods: add, remove, getSortedElements, count.
 */
public class Trie implements AbstractTrie {

    public TrieNode root;


    public Trie() {
        root = new TrieNode();
    }


    /**
     * Adds the element passed as parameter to the Trie.
     *
     * @param element - one of the implementations of TrieElement: Element1 or Element2
     */
    public void add(TrieElement element) {
        TrieNode current = advance(root, element);

        if (current.element == null || current.index == 0 ||
                element.getString().compareTo(current.element.getString()) < 0)
            current.element = element;

        current.index = current.index + 1;
    }

    /**
     * Counts the number of times a word has appeared.
     *
     * @param element - one of the implementations of TrieElement: Element1 or Element2
     * @return the counted value
     */
    public int count(TrieElement element) {
        TrieNode current = advance(root, element);
        return current.index;
    }

    /**
     * Removes one apparition of a word.
     *
     * @param element - one of the implementations of TrieElement: Element1 or Element2
     */
    public void remove(TrieElement element) {
        TrieNode current = advance(root, element);
        if (current.index > 0)
            current.index--;
    }

    /**
     * Recursively looks in the tree and finds all the words starting with the prefix.
     *
     * @param prefix - the prefix of the words to be searched in order.
     * @return an array of elements
     */
    public TrieElement[] getSortedElements(TrieElement prefix) {

        TrieNode current = advance(root, prefix);
        String s = preorder(current, current);
        String[] array = s.split(" ");
        Element1[] elements = new Element1[array.length];

        for (int i = 0; i < array.length; i++) {
            Element1 cuv = new Element1(array[i]);
            elements[i] = cuv;
        }

        char[] first = elements[0].getString().toCharArray();
        if (first.length == 0)
            return null;

        return elements;
    }


    /**
     * Advances in the data structure by going from the root to the element
     * letter by letter.
     */
    public TrieNode advance(TrieNode root, TrieElement element) {
        char[] tmp = element.toCharArray();
        TrieNode current = root;

        for (int i = 0; i < tmp.length; i++) {
            if (current.children[poz(tmp[i])] != null)
                current = current.children[poz(tmp[i])];
            else {
                current.children[poz(tmp[i])] = new TrieNode(element);
                current = current.children[poz(tmp[i])];
            }
        }
        return current;
    }

    /**
     * Goes through the trie in preorder: first root, then children from left to right.
     */
    public String preorder(TrieNode root, TrieNode aux) {
        String s = "";

        if (root == null)
            return "";

        if (root.index != 0 && root != aux)
            s = s + root.element.getString() + " ";
        else if (root.index != 0 && root == aux) {
            s = s + root.element.getString() + " ";
        }

        for (int i = 0; i < root.children.length; i++) {
            s = s + preorder(root.children[i], aux);
        }

        return s;
    }


    public int poz(char c) {
        return CharPriority.getPriority(c);
    }

}



