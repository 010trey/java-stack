package com.teje.test;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(2);
        dll.append(1);

        dll.printValuesBackward();

        System.out.println("Is Palindrome: " + dll.isPalindrome());

        dll.removeAt(2);
        dll.printValuesBackward();
        System.out.println("Is Palindrome: " + dll.isPalindrome());
    }
    
}