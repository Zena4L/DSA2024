package org.example.old.singlylinkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
//        myLinkedList.removeLast();
        myLinkedList.prepend(3);
        myLinkedList.printList();
    }
}
