import java.util.*;
public class UserInput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int add=num1+num2;
        System.out.println("Addition of two numbers="+add);
        
        System.out.println("Enter String");
        String str=sc.next();
        System.out.println(str);

        System.out.println("Enter Short");
        short s=sc.nextShort();
        System.out.println(s);

        System.out.println("Enter Byte");
        byte b=sc.nextByte();
        System.out.println(b);

        System.out.println("Enter Long");
        long l=sc.nextLong();
        System.out.println(l);

        System.out.println("Enter Boolean");
        boolean bool=sc.nextBoolean();
        System.out.println(bool);

        System.out.println("Enter Float");
        float f=sc.nextFloat();
        System.out.println(f);

        System.out.println("Enter double");
        double d=sc.nextDouble();
        System.out.println(d);

        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        System.out.println(ch);


        
    }
}