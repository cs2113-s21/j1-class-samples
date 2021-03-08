public class OuterB{

    private String x;

    public OuterB(String X){
        x = X;
    }
    
    public class InnerB{
        String x;
        
        public InnerB(String X){
            this.x = X;
            OuterB.this.x = OuterB.this.x + "."+this.x;
            //relies on the context of the instance of OuterB
        }
    }

    public static void main(String args[]){

        OuterB B = new OuterB("Hello");
        OuterB C = new OuterB("Goodbye");
        
        //B.new because it's within the context of B
        // because b has access to the fields of the instance of B
        OuterB.InnerB b = B.new InnerB("World");
        OuterB.InnerB c = C.new InnerB("World");

        System.out.println(b.x); //Hello
        System.out.println(B.x); //Hello.World
        System.out.println(C.x); //Goodbye.World
    }
}
