package OOPs.Abstraction;

abstract class Shape {// abstract class
    abstract float calculateArea();// abstract method
}

class Rectangle extends Shape {
    float length, breadth;

    public Rectangle(float length, float breadth) {// constructor
        this.length = length;
        this.breadth = breadth;
    }

    float calculateArea() {// overriding the abstract method
        return length * breadth;
    }
}

class Circle extends Shape {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }
}

class Square extends Shape {
    float side;

    public Square(float side) {
        this.side = side;
    }

    float calculateArea() {
        return (float) (side * side);
    }
}

public class MyClass2 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2, 3);
        Circle c1=new Circle(2);
        Square s1=new Square(3);
        r1.calculateArea();
        c1.calculateArea();
        s1.calculateArea();
    }
}
