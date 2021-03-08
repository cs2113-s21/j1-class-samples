public class Queue{

    private class Node{
        public Node next; //forward pointer
        public Node prev; //back pointer
        public String data; //data element
        public Node(String d){
            data = d;
            next = null;
            prev = null;
        }

    }

    // private Node head; //head pointer
    // private Node tail; //tail pointer

    protected Node head; //head pointer
    protected Node tail; //tail pointer

    public Queue(){
        //initialize to null
        head = tail = null;
    }

    public void enqueue(String d){
        //create a new node
        Node newHead = new Node(d);
        newHead.next = head;


        if(head == null){
            //empty queue
            head = newHead;
            tail = newHead;
        }else{
            //>=1 itme queue
            head.prev = newHead;
            head = newHead;
        }
    }

    public String dequeue(){
        String d;
        if(head == null){
            //empty queue
            d = null; 
        }else if (head == tail){
            //1 item queue
            d = head.data;
            head = tail = null;
        }else{
            //>1 item queue
            d = tail.data;
            tail = tail.prev;
        }
        return d;
    }

    public boolean empty(){
        return head == null;
    }

    public static void main(String args[]){
        Queue q = new Queue();

        for(int i = 0 ; i< 10;i++){
            q.enqueue(""+i);
        }

        while(!q.empty()){
            System.out.println(q.dequeue());
        }

        for(int i = 0 ; i< 20;i++){
            q.enqueue(""+i);
        }
        
        while(!q.empty()){
            System.out.println(q.dequeue());
        }

        for(int i = 0 ; i< 20;i++){
            System.out.println(q.dequeue());
        }


    }
}
