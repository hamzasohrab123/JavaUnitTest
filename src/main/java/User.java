import java.util.Map;

public class User {

    public String companyname;
    public int established;
    public Map<String, String> employees;
    public String[] roles;

    //this constructor is used to give values to the variables
    User(String companyname, int established, Map<String, String> employees, String[] roles){
        this.companyname = companyname;
        this.established = established;
        this.employees = employees;
        this.roles = roles;
    }

    //without default constructor Jackson will throw an error
    public User() {}

}