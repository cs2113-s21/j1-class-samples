
public class OuterA{

    private int x;
    private InnerA a;


    private class InnerA{
       int x;
        
       public InnerA(){
           
           this.x = OuterA.this.x + 10;
       }
    }

    public OuterA(int x){
        this.x= x;
        this.a = new InnerA();
    }
    
    
    public String toString(){ return ""+a.x; }

    public static void main(String args[]){
        OuterA a = new OuterA(100);
        System.out.println(a);
    }
}
