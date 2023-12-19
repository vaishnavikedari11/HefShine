package OOPs.SingleInheritance;

class Vehicle{
    void start(){
        System.out.println("The vehicle is started.");
    }
    void stop(){
        System.out.println("The vehicle is stopped.");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("The vehicle is in drive mode.");
    }
}
public class MyMainClass2 {
    public static void main(String[] args) {
    Car ob=new Car();
    ob.start();
    ob.stop();
    ob.drive();
    }
}
