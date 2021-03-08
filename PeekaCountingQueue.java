public class PeekaCountingQueue extends CountingQueue{

    public String peek(){
        if(empty()) return null;
        return head.data; //<-- this is the ideal!
    }
    
}
