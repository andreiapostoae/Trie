Trie is a Java implementation of the [trie](https://en.wikipedia.org/wiki/Trie) data structure. It was developed in November 2015 as an Object Oriented Programming assignment.

### How it works
The program expects a file "trie.in" as input and will output in a file called "trie.out". 

As it was required, it has two implementations:
* one that ignores the difference between lower and upper case
* one that ignores the next characters: - _ ( )

The first input line contains the words contained by the alphabet, separated through blank spaces.
It is followed by a number (n) and n operations done to the dictionary. Then there will be another number (m) and m operations done to the dictionary.

The first n operations respect the rule from the first implementation, and the rest respect the rule from the second implementation.

The output will contain (n + m) lines with the results after those operations.

### Features
This implementation supports 4 types of operation:
* **0 w** - adds the apparition of the word w to the list
* **1 w** - removes one apparition of the word w from the list
* **2 w** - prints the number of apparitions of word w
* **3 w** - prints out all the words from the dictionary that start with the w prefix, ordered lexicographically

### Compiling and running
A Makefile and an input and output example are included in the project.
```
make build
```
then
```
make run
```
You will find the output in trie.out.

