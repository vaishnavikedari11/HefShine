package OOPs.Polymorohism;

public class MethodOverloading1 {
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    static void add(int num1,int num2,int num3,int num4){
        System.out.println(num1+num2+num3+num4);
    }
    public static void main(String[] args) {
        
    add(2, 2);
   add(1,2,3);
  
   add(1,2,3,4);
}
}
