package OOPs;

public class MyClass6 {
    static void multiplication(){
        System.out.println("calling multiplication");
    }
    static void multiplication(int num){
        System.out.println("value of num= "+num);
    }
    static void multiplication(int a,int b){
        System.out.println("multiplication of a and b= "+(a*b));
    }
    public static void main(String[] args) {
        multiplication();
        multiplication(32);
        multiplication(2, 4);
    }
}
