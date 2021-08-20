public class Rectangle {

    int length;
    int breadth;

    Rectangle(int l, int b) {
        System.out.println("I'm Parent");
        length = l;
        breadth = b;

    }

        public void calculatearea () {
            int a = length * breadth;
            System.out.println("Area of Rectangle: " + a);

        }

        public void calculateperimeter () {

            int p = 2 * (length + breadth);
            System.out.println("Perimeter of Rectangle: " + p);

        }
    }

class Square extends Rectangle{

    public void calculatearea (){

        int a = length * length;
        System.out.println("Area of Square: " + a);

    }

    public void calculateperimeter (){

        int p = 4 * length;
        System.out.println("Perimeter of Square: " + p);

    }

    Square(int length, int breadth){

        super(length, breadth);
        System.out.println("I'm Child");

    }

    public static void main(String[] args) {

        Square s = new Square(2, 4);
        s.calculatearea();
        s.calculateperimeter();

        Rectangle r = new Rectangle(5, 10);
        r.calculatearea();
        r.calculateperimeter();

    }

}

