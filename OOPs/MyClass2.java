package OOPs;

public class MyClass2 {
    int sum(int a,int b){
        int result=a+b;
        return result;
    }
    int sub(int a,int b){
        int result=a-b;
        return result;
    }
    int mult(int a,int b){
        int result=a*b;
        return result;
    }
    int division(int a,int b){
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        MyClass2 ob=new MyClass2();
        System.out.println("sum  is = "+ ob.sum(3, 4));
        System.out.println("substraction is = "+ ob.sub(4, 6));
        System.out.println("multiplication is = "+ ob.mult(3,5));
        System.out.println("division  is = "+ob.division(4, 4));
    }
}
