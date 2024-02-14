package OOPs.Abstraction;

abstract class A{
    abstract void m1();
    abstract void m2();
}
abstract class child extends A{
    
}
abstract class D extends child{
    void m1(){
        System.out.println("m1 method....");
    }
}
class MyClass extends D{
    public static void main(String[] args) {
        MyClass ob=new MyClass();
        ob.m1();
        ob.m2();
    }
    void m2(){
        System.out.println("m2 method....");
    }
}
