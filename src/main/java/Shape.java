abstract public class Shape {

    public void area() {
        System.out.println("This is area");
    }

    public void perimeter() {
        System.out.println("This is perimeter");
    }

    abstract public void sides();

}

class Circle extends Shape {

    public void area() {
        System.out.println("I am Circle");
        System.out.println("This is Area");
    }

    public void perimeter() {
        System.out.println("I am Circle");
        System.out.println("This is Perimeter");
    }

    public void sides() {
        System.out.println("I Don't have any Sides");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.perimeter();
        c.sides();

    }

}