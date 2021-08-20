import org.testng.annotations.Test;

public class EmployeeTest{
    @Test
    public static void EmployeeTesting(){
        Employee();
        Employee("Kanta",1);
        Employee("Khairul",2,"abc street");

    }
    public static void Employee(){
        System.out.println("I am simple constructor");
    }
    public static void Employee(String name, int id){
        System.out.println("I have 2 parameters");
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }
    public static void Employee(String name, int id, String address)
    {
        System.out.println("I have 3 parameters");
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
    }

}












