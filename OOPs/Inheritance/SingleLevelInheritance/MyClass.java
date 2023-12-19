package OOPs.SingleInheritance;
//MyClass is child class that is inheritang properties of Number i.e., parent class.
public class MyClass extends Number {
    //instance variable
    int a=30;
    //instance method
    void m2(){
        System.out.println("m2 calling from child class");
    }
    //consrtuctor
    MyClass(){
        System.out.println("child class constructor");
    }
    public static void main(String[] args) {
        MyClass ob=new MyClass();
        System.out.println(ob.a);
        //we can access instance variables of other class using object
        System.out.println(ob.x);
        //we can access static variables of other class without or with using object
        System.out.println(s);
        //we can not access local variables of other class
        //System.out.println(y);
        ob.m2();
        //we can access instance method of other class using object
        ob.m1();
        //we can access static methof of other class without or with using object
        m3();
        //we use super keyword for accessing parent class varibles,methods,constructor
        //we can used this keyword for accessing child class

        //we can access parent class consturctors without calling-
        //because after calling child class constructor it can automatically call parent class constructor first and then child class constructor is called.
        new MyClass();
    }
}
