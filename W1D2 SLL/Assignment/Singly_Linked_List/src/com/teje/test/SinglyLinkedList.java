package com.teje.test;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
        } else {
            Node runner = head;
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    public void printValues() {
        Node runner = head;
        while (runner != null) {
            System.out.print(runner.value + " -> ");
            runner = runner.next;
        }
        System.out.println("null");
    }
}
