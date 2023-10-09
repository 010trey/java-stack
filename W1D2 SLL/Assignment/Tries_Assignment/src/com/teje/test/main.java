package com.teje.test;

public class main {

	public static void main(String[] args) {
		
	        Trie trie = new Trie();
	        trie.insert("apple");
	        trie.insert("app");
	        trie.insert("banana");
	        trie.insert("bat");

	        System.out.println("Is Prefix 'app' Valid: " + trie.isPrefixValid("app"));
	        System.out.println("Is Word 'app' Valid: " + trie.isWordValid("app"));
	        System.out.println("Is Prefix 'ban' Valid: " + trie.isPrefixValid("ban"));
	        System.out.println("Is Word 'ban' Valid: " + trie.isWordValid("ban"));

	        System.out.println("All Keys in the Trie:");
	        trie.printAllKeys();
	


	}

}
