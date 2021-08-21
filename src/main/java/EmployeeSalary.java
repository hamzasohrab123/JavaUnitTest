
public class EmployeeSalary {

    public static void info(int id, String n, String d)
    {
        System.out.println("id: " + id);
        System.out.println("name: " + n);
        System.out.println("designation: " + d);

    }

    public static void salary(String d) {

        if (d == "peon") {
            System.out.println("Salary is 5000");
        }
        else if (d.equals("assistant")){
            System.out.println("Salary is 10000");
        }
        else{
            int salary = 10000 * 2;
            System.out.println("Salary is " + salary);

        }
    }

    public static void main(String[] args) {

        EmployeeSalary manager = new EmployeeSalary();
        manager.info(100, "Hamza", "Manager");
        manager.salary("manager");

        EmployeeSalary assistant = new EmployeeSalary();
        assistant.info(101, "Fahad", "Assistant");
        assistant.salary("assistant");

        EmployeeSalary peon = new EmployeeSalary();
        peon.info(102, "Hamid", "Peon");
        peon.salary("peon");

    }

}

