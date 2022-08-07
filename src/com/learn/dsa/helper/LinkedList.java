package com.learn.dsa.helper;

public class LinkedList {
    private Node first;

    public LinkedList(){
        this.first = null;
    }

    public void addFirst(int value){
        System.out.println("Adding "+value+" at first");
        Node n = new Node();
        n.setValue(value);
        n.setNode(first);
        first = n;
    }

    public void delete(int val){
        if(first == null){
            System.out.println("Linked List doesn't contains "+val);
        }
        else{
            System.out.println(val+" selected to be deleted from LinkedList");
            Node c = first;
            Node prev = null;
            while(c != null && c.getValue() != val){
                prev = c;
                c=c.node;

            }
            if(c == first){
                first = first.node;
            }
            else if (c != null){
                prev.node=c.node;
            }
            else{
                System.out.println("Value "+val+" not present in Linked List");
            }

        }
    }

    public void display(){
        if(first == null){
            System.out.println("Empty Linked List");
        }
        else{
            System.out.print("Displaying Contents of Linked List : ");
            Node c = first;
            while(c != null){
                System.out.print(c.getValue()+" ");
                c=c.getNode();
            }
            System.out.println("");
        }
    }
}
