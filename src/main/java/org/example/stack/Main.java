package org.example.stack;

public class Main {
    public static void main(String[] args) {
        var myStackList = new Stack(7);
        myStackList.push(5);
        myStackList.pop();
        myStackList.printStack();
    }
}
