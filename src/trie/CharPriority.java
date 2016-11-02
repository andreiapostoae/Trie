package trie;

/**
 * Responsible for returning the correct priority for any character.
 * This is needed because the priority is not the same as the ASCII order.
 * Correct priorities: ! ( ) - ? 0-9 _ A-Z a-z
 */
public class CharPriority {
    public static int getPriority(char c) {
        if (c == 40 || c == 41) // ( )
            return c - 39;
        else if (c == 33) // !
            return 0;
        else if (c == 63) // ?
            return 4;
        else if (c == 95) // _
            return 15;
        else if (c == 45) // -
            return 3;
        else if (65 <= c && c <= 90) // upperCase letter
            return c - 49;
        else if (48 <= c && c <= 57) // digits
            return c - 43;
        return c - 55; // lowerCase letter
    }

}
