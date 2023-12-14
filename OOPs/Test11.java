package OOPs;
//this keyword used to refer object
//constuctors can call from another constructor wile it is first statement of that 
public class Test11 {
    Test11(){
        this(11);
        System.out.println("zero args");
    }
    Test11(int a){
        this(1,2);
        System.out.println("one args");
    }
    Test11(int a,int b){
        
        System.out.println("two args");
    }
    public static void main(String[] args) {
        Test11 t1=new Test11();

    }
}
