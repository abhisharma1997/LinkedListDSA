
class Node{
    int value;
    Node node;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}

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
