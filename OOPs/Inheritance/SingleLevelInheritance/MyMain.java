package OOPs.SingleInheritance;
//child class of Demo class
public class MyMain extends Demo {
    //instance variable
    int x=20;
    int y=30;
    //static variable
    static int z=21;

    //method name show
    void show(){
        System.out.println("x value of child class = "+this.x);
        System.out.println("y value of child class = "+this.y);
        System.out.println("z value of child class = "+z);
             System.out.println("--------------------------");
        System.out.println("x value of parent class Demo = "+super.x);
        System.out.println("y value of parent class Demo = "+super.y);
        System.out.println("z value of parent class Demo = "+super.z);
    }
    public static void main(String[] args) {
        MyMain ob=new MyMain();
        ob.show();
    }

}
