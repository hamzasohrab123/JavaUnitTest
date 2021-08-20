/*
public class SuperEmployee{

    int id;
    String name;

    public SuperEmployee(int i,String n){
        id=i;
        name=n;
    }

}
class Person extends SuperEmployee {

    int salary;

    Person(int i, String n, int s) {

        super(i, n);
        salary = s;

    }

    public void printinfo() {
        System.out.println("NAME of Person is " + name + " ID of Person is " + id + " SALARY of Person is " + salary);
    }

    public static void main(String[] args) {
        Person e = new Person(1, "Kanta", 5);
        e.printinfo();
    }
}
*/

public class SuperEmployee{

    int id;
    String name;

    SuperEmployee(int id,String name){

        //this keyword is going to assign value to the parameters of it's constructor
        //THIS THING ONLY HAPPENS WHEN THE VARIABLES/PARAMETERS ARE OF WRITTEN SAME
        this.id = id;
        this.name = name;

    }

    public void print(){

        System.out.println("NAME of Person is " +name+" ID of Person is "+id);

    }
    public static void main(String []args){

        SuperEmployee e = new SuperEmployee(1,"Kanta");
        e.print();

    }
}
