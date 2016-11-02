package trie;

/**
 * Second type of TrieElement, which ignores the following characters: ( ) - _
 */

import java.util.Arrays;

public class Element2 implements TrieElement {

    String s = new String();

    public Element2(String s) {
        this.s = s;
    }

    /**
     * Transforms the string into an array of characters where the above characters
     * are ignored.
     */
    public char[] toCharArray() {
        char[] tmp = s.toCharArray();
        char[] array = new char[20];
        int i, j = 0;
        for (i = 0; i < tmp.length; i++) {
            if (poz(tmp[i]) == 0 ||
                    (poz(tmp[i]) >= 4 && poz(tmp[i]) <= 14) ||
                    (poz(tmp[i]) >= 16 && poz(tmp[i]) <= 67)) {
                array[j] = tmp[i];
                j++;
            }
        }
        array = Arrays.copyOf(array, j);
        return array;
    }


    public String getString() {
        return s;
    }


    public int poz(char c) {
        return CharPriority.getPriority(c);
    }
}
