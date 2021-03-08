public class CountingQueue extends Queue{

    private int theSize;
    
    public CountingQueue(){
        super();
    }

    //how can I use inheritance to track theSize?

    public void enqueue(String s){
        theSize + = 1;
        super.enqueue(s);
    }

    public String dequeue(){
        if(empty()) return null;
        
        theSize -= 1;
        return super.dequeue();
    }
    
    public int size(){
        return theSize; //<--- should return the number of elements in the queue
    }


}
