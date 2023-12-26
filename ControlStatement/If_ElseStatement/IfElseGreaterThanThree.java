public class IfElseGreaterThanThree {
    public static void main(String[] args) {
        int a=23;
        int b=2;
        int c=32;
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>a && b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }
    }
}
