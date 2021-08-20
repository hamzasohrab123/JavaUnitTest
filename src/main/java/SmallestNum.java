public class SmallestNum {
    public static void main(String[] args) {

        int x = 11;
        int y = 10;
        int z = 12;

        if (x<y && x<z){
            System.out.println("x is the Smallest Number");
        }
        else if (y<x && y<z){
            System.out.println("y is the Smallest Number");
        }
        else{
            System.out.println("z is the Smallest Number");
        }

    }
}
