package org.example;

import org.example.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
//        myLinkedList.removeLast();
        myLinkedList.prepend(3);
        myLinkedList.printList();


    }
}