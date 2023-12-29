package org.example.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(5);
        myDLL.prepend(6);
        myDLL.removeFirst();
        myDLL.printList();
    }
}
