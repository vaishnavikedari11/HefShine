package OOPs.Polymorohism;

public class MehodOverloading {
    static void mul(int num1,int num2){
        System.out.println(num1*num2);
    }
    static void mul(int num1,int num2,int num3){
        System.out.println(num1*num2*num3);
    }
    static void mul(int num1,int num2,int num3,int num4){
        System.out.println(num1*num2*num3*num4);
    }
    public static void main(String[] args) {
        mul(2, 2);
        mul(2, 2, 3);
        mul(2,2,3,4);
    }
}
