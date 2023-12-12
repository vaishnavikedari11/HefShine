package OOPs;

public class MyClass3 {
    //no return type ,no argument
    void sum(){
        int n1=12;
        int n2=23;
        System.out.println(n1+n2);
    }
    //with arguments ,no return type
    void sum(int n,int m){
        System.out.println(n+m);

    }
    //with argument ,with return type
    float sum(float a,float b){
        float result=a+b;
        return result;
    }
    public static void main(String[] args) {
        
    }
}
