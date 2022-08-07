package com.learn.dsa.util;

import com.learn.dsa.helper.LinkedList;

import java.util.Scanner;

public class LinkedListUtil {
    Scanner scanner =  new Scanner(System.in);

    public LinkedListUtil(){


    }
    private int crudOperationsSelector(){
        System.out.println("Please Select Operations As below");
        System.out.println(" 1.Add \n 2.Delete \n 3.Display \n 0.Exit");
        int choice = scanner.nextInt();

        return choice;
    }

    public void crudActions(){
        LinkedList l = new LinkedList();
        boolean cont = true;
        while (cont==true) {

            int action = crudOperationsSelector();

            switch (action){
                case 1 :
                    System.out.println("Please enter number to add into Linked List :");
                    int numAdd = scanner.nextInt();
                    l.addFirst(numAdd);
                    break;
                case 2 :
                    System.out.println("Please enter number to remove from LinkedList");
                    int numDel = scanner.nextInt();
                    l.delete(numDel);
                    break;
                case 3 :
                    l.display();
                    break;
                case 0:
                    cont = false;
                    break;
                default:
                    System.out.println("Please choose Action between the option given above to proceed or type 0 to close.");
                    action = scanner.nextInt();
                    break;
            }

        }


    }
}
