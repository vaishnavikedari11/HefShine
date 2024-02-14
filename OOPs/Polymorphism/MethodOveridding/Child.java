package OOPs.MethodOveridding;

public class Child extends Parent{
    //instance variable
    int x=21;
    int y=22;
    //non static method
    void display(){
        System.out.println("child class display method....");
    }
    //same method as child class method 
    void sum(){
        super.sum();
        int z=x+y;
        System.out.println("child class method sum = "+z);
    }
    //static method
    static void m1(){
        System.out.println("static method m1 in child class");
    }


    public static void main(String[] args) {
        Child ob=new Child();
        ob.sum();
        //static method can be acces in main method without object because of main method is static method
        m1();
        //parent class method
        Parent.m1();

    }
}
