//swapping without using third variable
public class SwappingWithoutThirdVariable {
    public static void main(String[] args) {
        int a=9;
        int b=8;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
}
