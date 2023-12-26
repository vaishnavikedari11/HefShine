public class IfElsePercentage {
    public static void main(String[] args) {
        int sub1=87;
        int sub2=35;
        int sub3=78;
        int sub4=76;
        int sub5=34;
        int sum=sub1+sub2+sub3+sub4+sub5;

        int percentage=(sum*100)/500;
        System.out.println(percentage);
        if(percentage>=90){
            System.out.println("Grade A");
        }else if(percentage>=80){
            System.out.println("Grade B");
        }else if(percentage>=70){
            System.out.println("Grade C");
        }else if(percentage>=60){
            System.out.println("Grade D");
        }else if(percentage>=40){
            System.out.println("Grade E");
        }else{
            System.out.println("Grade F");
        }
    }
}
