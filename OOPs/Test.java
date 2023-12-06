package OOPs;
//create 2 static variable
//create 2 instance variable
//do addition operation on instance varibale
//do multiplication on static
//do substaction on local
//print the result

public class Test{
    //instance variable
    int x=23;
    int y=45;
    static int a=34;
    static int b=65;
    public static void main(String[] args) {
        int m=34;
        int n=43;
        Test t=new Test();
        System.out.println("Adiition of instance variable ="+(t.x+t.y));
        System.out.println("multiplication of static="+(a*b));
        System.out.println("Substraction of local variableas="+(m-n));
    }

}