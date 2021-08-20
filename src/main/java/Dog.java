//Child Class

public class Dog extends Animal {
    // Child Class Extending Parent Class

    public void intro(){
        // Method Overriding

        System.out.println("I am an Animal");
        System.out.println("I am a Dog");
    }

    public void speak(){
        // Method Overriding
        System.out.println("I can speak");
        System.out.println("I bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.intro();
        d.speak();
    }
}
