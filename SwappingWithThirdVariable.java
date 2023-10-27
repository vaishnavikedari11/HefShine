//swapping with third variable
public class SwappingWithThirdVariable {
    public static void main(String[] args) {
        int a=8;
        int b=9;
        System.out.println("before swapping");
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
        
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("afeter swapping");
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
}
