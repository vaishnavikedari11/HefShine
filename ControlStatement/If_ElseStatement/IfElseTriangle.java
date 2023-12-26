public class IfElseTriangle {
    public static void main(String[] args) {
        int side1=32;
        int side2=43;
        int side3=54;
        if(side1==side2 && side2==side3 && side3==side1){
            System.out.println("Triangle is Equilateral Triangle");
        }else if(side1==side2 || side2==side3 ||side2==side3){
            System.out.println("Triangle is Isoscalene");
        }else{
            System.out.println("Triangle is Scalene");
        }
    }
}
