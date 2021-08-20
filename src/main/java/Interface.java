interface Bicycle {

    void blowhorn();
    void applybrake();

}

interface Car {

    void speedup();
    void changegear();

}

class Bmx implements Bicycle, Car{

    public void blowhorn(){
        System.out.println("Horn iss ");
    }

    public void applybrake(){
        System.out.println("Brakes Applied");
    }

    public void speedup(){
        System.out.println("Speed is Increased");
    }

    public void changegear(){
        System.out.println("Gear is Changed");
    }

}

    public class Interface {

        public static void main(String[] args) {

            Bmx b = new Bmx();
            b.applybrake();
            b.blowhorn();

            Bmx c = new Bmx();
            c.speedup();
            c.changegear();

        }
    }
