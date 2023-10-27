public class Swapping {
    public static void main(String[] args) {
        int a=4;
        int b=9;
        System.out.println("Before swapping");
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);

        //swapping
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping ");
        System.out.println("value of a = "+a);
        System.out.println("value of b= "+b);

        //without using temprory variable
        int d=4;
        int e=2;


        d=d+e;
        e=d-e;
        d=d-e;
        System.out.println("after swapping without temprory variabale");
        System.out.println("value of d="+d);
        System.out.println("value of e="+e);
    }
}
