package com.learn.dsa;

import com.learn.dsa.helper.LinkedList;

public class LinkedListImpl {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.delete(30);
        l.display();




    }
}
