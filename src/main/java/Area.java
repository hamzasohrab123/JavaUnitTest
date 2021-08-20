import java.util.*;

public class Area {

    public static void setDim(int length, int breadth){
        System.out.println("Entered Length: " + length);
        System.out.println("Entered Breath: " + breadth);

    }

    public static void getArea(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area: " + area);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length: ");
        int len = sc.nextInt();
        System.out.println("Enter the Breadth: ");
        int brea = sc.nextInt();
        setDim(len, brea);
        getArea(len, brea);
    }

}