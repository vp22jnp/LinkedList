package com.day14;

public class LinkedListUc1<T> {
    Node<T> head;
    Node<T> tail;
    public void push (T data){
        Node<T> newNode = new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void add (T data){
        Node<T>newNode=new Node(data);
        if (head==null) {
            head = newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
}
