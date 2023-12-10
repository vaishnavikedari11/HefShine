package OOPs;

public class MyClass5 {
    static void m1(){
        System.out.println("calling m1..");
    }
    static void m1(int num){
        System.out.println("value of num = "+num);
    }
    public static void main(String[] args) {
        m1();
        m1(65);
    }
}
