package OOPs;

public class MyClass {
    void sum(int n){
        System.out.println(n);
    }
    void sum(int n,int m){
        System.out.println(n+m);
    }
    void sum(int n,int m,int d){
        System.out.println(n+m+d);
    }
    void display(){
        System.out.println("ans = ");
    }
    void display(int o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        MyClass ob=new MyClass();
        ob.sum(1);
        ob.sum(2, 3);
        ob.sum(4, 5, 6);
        ob.display();
        ob.display(66);
        

    }
}
