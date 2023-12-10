package OOPs;
public class MyClass4 {
    static void display(){
        System.out.println("hello All..");
    }
    static{
        System.out.println("hiii");
    }
    {
        System.out.println("bye");
    }
    void m1(){
        System.out.println("m1...");
    }
    public static void main(String[] args) {
        MyClass4 ob=new MyClass4();
        display();
        ob.m1();


    }
}
