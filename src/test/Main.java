package test;

import trie.Element1;
import trie.Element2;
import trie.Trie;

public class Main {

    public static void main(String[] args) {
        Trie trie1 = new Trie();
        TestReader reader = new TestReader("trie.in");
        TestWriter writer = new TestWriter("trie.out");
        String[] words = reader.getWords();
        Command[] comm1 = reader.getFirstCommands();
        Command[] comm2 = reader.getSecondCommands();
        for (int i = 0; i < words.length; i++) {
            Element1 cuv = new Element1(words[i]);
            trie1.add(cuv);
        }

        for (int i = 0; i < comm1.length; i++) {
            Element1 cuv = new Element1(comm1[i].getWord());
            if (comm1[i].getType() == 0) {
                trie1.add(cuv);
            }
            if (comm1[i].getType() == 1) {
                trie1.remove(cuv);
            }
            if (comm1[i].getType() == 2) {
                writer.printCount(trie1.count(cuv));
            }
            if (comm1[i].getType() == 3) {
                writer.printSortedWords(trie1.getSortedElements(cuv));
            }
        }

        Trie trie2 = new Trie();
        for (int i = 0; i < words.length; i++) {
            Element2 cuv = new Element2(words[i]);
            trie2.add(cuv);
        }

        for (int i = 0; i < comm2.length; i++) {
            Element2 cuv = new Element2(comm2[i].getWord());
            if (comm2[i].getType() == 0) {
                trie2.add(cuv);
            }
            if (comm2[i].getType() == 1) {
                trie2.remove(cuv);
            }
            if (comm2[i].getType() == 2) {
                writer.printCount(trie2.count(cuv));
            }
            if (comm2[i].getType() == 3) {
                writer.printSortedWords(trie2.getSortedElements(cuv));
            }
        }

        writer.close();

    }

}
