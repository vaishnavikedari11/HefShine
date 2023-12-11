package OOPs;
//2 instance n1,n2
// constructor-initialize
 

public class Constructor3 {
    int n1;
    int n2;
    public Constructor3(int x,int y){
        n1=x;
        n2=y;
    }
    public void sum(int x,int y){
        int result=x+y;
        System.out.println("sum of x,y ="+result);
    }
    public static void main(String[] args) {
        Constructor3 obj=new Constructor3(4, 4);
        System.out.println(obj.n1+" ,"+obj.n2);
        obj.sum(obj.n1, obj.n2);
    }
}
