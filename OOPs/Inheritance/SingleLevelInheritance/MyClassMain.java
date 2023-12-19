package OOPs.SingleInheritance;
class ParentClass{
    int x=100;
    static String name="ABC";
    void m1(){
        System.out.println(x+" "+name);
    }
}
class ChildClass extends ParentClass{
    int y=29;
    void m2(){
        System.out.println("m2() in childclass :"+y);
    }
}
public class MyClassMain {
    public static void main(String[] args) {
        ChildClass ob=new ChildClass();
        ob.m1();
        ob.m2();
    }
}
