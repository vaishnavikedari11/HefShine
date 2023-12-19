package OOPs.SingleInheritance;

public class Number {
    //instance variable
    int x=10;
    //static variable
    static String s="inheritance";
    //instance method
    void m1(){
        //local variable
        int y=20;
        System.out.println("m1 is calling from parent class");
    }
    //static method
    static void m3(){
        System.out.println("m3 calling from parent class");
    }
    //constructor
    Number(){
        System.out.println("Parent class constructor");
    }
}
