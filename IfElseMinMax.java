public class IfElseMinMax {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;
//code for maximum
        if(num1>num2 && num1>num3 ){
            System.out.println("max :+num ");
        }else if(num2>num1 && num2>num3){
            System.out.println(" max : num2 :");
        }else{
            System.out.println("max : num3");
        }
//code for minimum
        if(num1<num2 && num1<num3){
            System.out.println("min : num1");
        }else if(num2<num1 && num2<num3){
            System.out.println(" min : num2");
        }else{
            System.out.println(" min :num3 ");
        }

        //other way
        //using nested if
        if(num1>num2 && num1>num3){
            System.out.println("num1 is reater");
            if(num2<num3){
                System.out.println("num2 is min");
            }else {
                System.out.println("num 3 is min");
            }
        }else if(num2>num1 && num2>num3){
            System.out.println("num 2 is max");
            if(num1<num3){
                System.out.println("num1 is min");
            }else{
                System.out.println("num3 is min");
            }
        }else{
            System.out.println("num3 is max");
            if(num2<num1){
                System.out.println("num2 is min");
            }else{
                System.out.println("num1 is min");
            }
        }
    }
}
