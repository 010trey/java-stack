package com.teje.test;

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // Assuming lowercase English letters
        isEndOfWord = false;
    }
}
//
//public class Trie {
//    private TrieNode root;
//
//    public Trie() {
//        root = new TrieNode();
//    }
//
//    // Insert a word into the Trie
//    public void insert(String word) {
//        TrieNode current = root;
//        for (char ch : word.toCharArray()) {
//            int index = ch - 'a';
//            if (current.children[index] == null) {
//                current.children[index] = new TrieNode();
//            }
//            current = current.children[index];
//        }
//        current.isEndOfWord = true;
//    }
//
//    // Check if a prefix is valid
//    public boolean isPrefixValid(String prefix) {
//        TrieNode current = root;
//        for (char ch : prefix.toCharArray()) {
//            int index = ch - 'a';
//            if (current.children[index] == null) {
//                return false;
//            }
//            current = current.children[index];
//        }
//        return true;
//    }
//
//    // Check if a word is valid
//    public boolean isWordValid(String word) {
//        TrieNode current = root;
//        for (char ch : word.toCharArray()) {
//            int index = ch - 'a';
//            if (current.children[index] == null) {
//                return false;
//            }
//            current = current.children[index];
//        }
//        return current.isEndOfWord;
//    }
//
//    // Print all keys in the Trie
//    public void printAllKeys() {
//        printKeys(root, new StringBuilder());
//    }
//
//    private void printKeys(TrieNode node, StringBuilder prefix) {
//        if (node.isEndOfWord) {
//            System.out.println(prefix.toString());
//        }
//
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            int index = ch - 'a';
//            if (node.children[index] != null) {
//                prefix.append(ch);
//                printKeys(node.children[index], prefix);
//                prefix.deleteCharAt(prefix.length() - 1);
//            }
//        }
//    }
//}
////
//    public static void main(String[] args) {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        trie.insert("app");
//        trie.insert("banana");
//        trie.insert("bat");
//
//        System.out.println("Is Prefix 'app' Valid: " + trie.isPrefixValid("app"));
//        System.out.println("Is Word 'app' Valid: " + trie.isWordValid("app"));
//        System.out.println("Is Prefix 'ban' Valid: " + trie.isPrefixValid("ban"));
//        System.out.println("Is Word 'ban' Valid: " + trie.isWordValid("ban"));
//
//        System.out.println("All Keys in the Trie:");
//        trie.printAllKeys();
//    }
//}
