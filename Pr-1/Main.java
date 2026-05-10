// Design an abstract class `Shape` that contains abstract methods `area()` and `perimeter()`. Create subclasses `Circle` and `Rectangle` that implement these methods to calculate area and perimeter.

abstract class Shape {

    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {

    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    double len;
    double wid;

    Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    double area() {
        return len * wid;
    }

    double perimeter() {
        return 2 * (len + wid);
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(50, 80);

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Circle Perimeter: " + s1.perimeter());

        System.out.println("Rectangle Area: " + s2.area());
        System.out.println("Rectangle Perimeter: " + s2.perimeter());
    }
}
 