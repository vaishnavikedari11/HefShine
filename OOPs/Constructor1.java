package OOPs;

public class Constructor1 {
    int num=9;
    public Constructor1(){
        System.out.println("hiiii..");
        num=9;
    }
    public Constructor1(int x){
        num=x;
    }
    public Constructor1(int x,int y){
        num=x+y;
    }
    public static void main(String[] args) {
        Constructor1 obj1=new Constructor1();
        System.out.println(obj1.num);
        Constructor1 obj2=new Constructor1(25);
        System.out.println(obj2.num);
    }
}
