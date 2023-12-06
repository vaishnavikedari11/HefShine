package OOPs;
//create shape class,make methods with no return type but with argumenets

//1,area of recatange
//2,area of square
//area of triangle;
//4,area of circles
//5,perimeter of rectangle
//6,perimeter of square
//7,perimeter of triangle
//8,perimeter of circles

public class Shape {
    void rectArea(int length, int breadth) {
        System.out.println("Area of rectangle = " + (length * breadth));
    }

    void sqArea(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void triArea(int side, int side2) {

        System.out.println("Area of Triangle = " + ((  side* side2)/2));
    }

    void circleArea(int radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    void rectPeri(int length, int breadth) {
        System.out.println("Perimeter of Rectangle = " + (2 * length * breadth));

    }

    void sqPeri(int side) {
        System.out.println("Perimeter of Square = " + (4 * side));

    }

    void triPeri(int side1, int side2, int side3) {
        System.out.println("Perimeter of Triangle = " + (side1 + side2 + side3));
    }

    void circlePeri(int radius) {
        System.out.println("Perimeter of Square = " + (2 * 3.14 * radius));
    }

    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.rectArea(2, 3);
        sh.sqArea(3);
        sh.triArea(2, 5);
        sh.circleArea(6);
        sh.rectPeri(5, 2);
        sh.sqPeri(7);
        sh.triPeri(2, 3, 4);
        sh.circlePeri(4);
    }
}
