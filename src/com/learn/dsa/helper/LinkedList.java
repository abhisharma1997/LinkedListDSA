package com.learn.dsa.helper;

public class LinkedList {
    private Node first;

    public LinkedList(){
        this.first = null;
    }

    public void addFirst(int value){
        Node n = new Node();
        n.setValue(value);
        n.setNode(first);
        first = n;
    }

    public void delete(int val){
        if(first == null){
            System.out.println("Empty");
        }
        else{
            Node c = first;
            Node prev = null;
            while(c.getValue() != val){
                prev = c;
                c=c.node;

            }
            if(c == first){
                first = first.node;
            }
            else{
                prev.node=c.node;
            }

        }
    }

    public void display(){
        if(first == null){
            System.out.println("Empty LL");
        }
        else{
            Node c = first;
            while(c != null){
                System.out.println(c.getValue());
                c=c.getNode();
            }
        }
    }
}
