package com.teje.test;

class Node {
    Integer data;
    Node prev;
    Node next;

    public Node(Integer data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Add a node to the end of the list
    public void append(Integer data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Print values backward
    public void printValuesBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Remove and return the last node
    public Node pop() {
        if (tail == null) {
            return null;
        }
        Node removedNode = tail;
        if (tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
        } else {
            head = null;
            tail = null;
        }
        return removedNode;
    }

    // Check if the list contains a value
    public boolean contains(Integer value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get the size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Insert a node at a specific index
    public void insertAt(Node newNode, int index) {
        if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.prev = current;
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    // Remove a node at a specific index
    public void removeAt(int index) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
                if (head == null) {
                    tail = null;
                }
            }
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current == tail) {
                tail = current.prev;
            }
        }
    }

    // Check if the list is a palindrome
    public boolean isPalindrome() {
        if (head == null || tail == null) {
            return false; // Empty list is not a palindrome
        }

        Node front = head;
        Node back = tail;

        while (front != back) {
            if (!front.data.equals(back.data)) {
                return false;
            }
            if (front.next == back && back.prev == front) {
                break; // Odd number of elements, and we've reached the middle
            }
            front = front.next;
            back = back.prev;
        }
        return true;
    }
}




