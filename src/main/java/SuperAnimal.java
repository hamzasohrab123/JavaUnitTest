public class SuperAnimal {

    String name;
    String colour = "Blue";

}

class Dolphin extends SuperAnimal{

    String colour = "White";
    public void getcolour(){

        System.out.println("Colour of Dolphin is: " + super.colour);
        System.out.println("Colour of Dolphin is: " + colour);

    }

    public static void main(String []args){

        Dolphin d = new Dolphin();
        d.getcolour();

    }

}
