package com.lists;
import java.util.*;
public class Linkedlist {
    public static void main(String [] args)
    {
        LinkedList<String> list=new LinkedList<String>();
        list.add("vaibhav");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Anuj");
        list.add("Gaurav");
        list.add("Harsh");
        System.out.println("Initial list of elements: "+list);
        list.remove("Vijay");
        System.out.println("After invoking remove(object) method: "+list);
        list.remove(0);
        System.out.println("After invoking remove(index) method: "+list);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Ravi");
        ll2.add("Hanumat");
        list.addAll(ll2);
        System.out.println("Updated list : "+list);
        list.removeAll(ll2);
        System.out.println("After invoking removeAll() method: "+list);
        list.removeFirst();
        System.out.println("After invoking removeFirst() method: "+list);
        list.removeLast();
        System.out.println("After invoking removeLast() method: "+list);
        list.clear();
        System.out.println("After invoking clear() method: "+list);
    }
}

