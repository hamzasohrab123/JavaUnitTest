//Interface class
interface PhoneCamera{

    void takesnap();
    void takescreenshot();

    //Default Method is used to add functionality into existing interface
    default void recordvideo(){
        System.out.println("I can Record a Video");
    }
}

// Parent Class
class CellPhone{

    public void sendtext(){
        System.out.println("I can send a Text");
    }

    public void makeacall(){
        System.out.println("I can make a Call");
    }

}

//Child Class Extending Parent Class and Implementing Interface Class
class MyOnePLus extends CellPhone implements PhoneCamera{

    //Methods extending
    public void Playgames(){
        System.out.println("I can Play Games");
    }

    public void surfinternet(){
        System.out.println("I can Browse Internet");
    }

    //Writing public is must when dealing with Interface Methods
    public void takesnap(){
        System.out.println("I can take a Snap");
    }
    public void takescreenshot(){
        System.out.println("I can take a ScreenShot");
    }

}


//Main Public Class
public class DefaultMethods {
    public static void main(String[] args) {

        //object is made and with that all Methods are being Called
        MyOnePLus op = new MyOnePLus();
        op.Playgames();
        op.surfinternet();
        op.takescreenshot();
        op.takesnap();
        op.makeacall();
        op.sendtext();
        op.recordvideo();

    }

}
