package com.lists;

public class add {
    public static void main(String[] args) {

        System.out.println("----- Welcome to Data Structure: Linked List -----");

        Linkedlist1.MyNode<Integer> firstNode = new Linkedlist1.MyNode<Integer>(56);
        Linkedlist1.MyNode<Integer> secondNode = new Linkedlist1.MyNode<Integer>(30);
        Linkedlist1.MyNode<Integer> thirdNode = new Linkedlist1.MyNode<Integer>(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
    }
}

