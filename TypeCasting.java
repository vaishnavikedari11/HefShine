import static java.lang.Math.PI;
public class TypeCasting {
    public static void main(String[] args) {
        //implicit typecasting
        int x=8;
        float y=x;
    
        System.out.println(y);
        double radius=5.5;
        //explicit typecasting
        float area=(float)(PI*radius*radius);
        System.out.println("area of circle is = "+area);

        double peri=(2*PI*radius);
        System.out.println("perimeter of circle = "+peri);



    }
}
