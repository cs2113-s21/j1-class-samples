public class LinkedList{

    private Node head;


    //data hidden and encapsulated within of the LinkedList
    private class Node{ //inner (private) class
        Node next;
        int data;

        public Node(int d){
            data = d;
            next = null;
        }

        public void foo(){ //hass access to all the private members of LinkedList
        }
    }

    public LinkedList(){
        head = null;
    }

    public void addHead(int d){
        newHead = new Node(d);
        newHead.next = head;
    }

    //get(int indx, int d)
    //set(int i)
    //rmHead() ...
}
