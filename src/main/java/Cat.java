//Child Class

public class Cat extends Animal{
    // Child Class Extending Parent Class

    public void intro(){
        // Method Overriding

        System.out.println("I am an Animal");
        System.out.println("I am a Cat");
    }

    public void speak(){
        // Method Overriding

        System.out.println("I can speak");
        System.out.println("I make meow sound");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.intro();
        c.speak();
    }

}

