package org.example.old.queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        var newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void enqueue(int value){
        var newNode = new Node(value);
        if (length == 0){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        if(length == 0) return null;
        Node temp = first;

        if(length == 1){
            first = null;
            last = null;
        }else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return  temp;
    }
}
