package OOPs;

public class Method {
    //non-static method
    //methods with no return type and no arguments
    public void inputData(){
        int n1=353;
        int n2=543;
        sum(n1,n2);
    }
    public void sum(int n1,int n2){
       // int num1=43;
        //int num2=64;
        int result=n1+n2;
       // System.out.println(result);
       display(result);


    }
    //method with argument but no return type
    public void display(int r){
        System.out.println(r);
    }
    //method with argument but no return type

    public static void main(String[] args) {
        System.out.println("hello world");
        Method test=new Method();
        test.inputData();
    }
}
