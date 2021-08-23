import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToJson {

    public static void main(String[] args) {

        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstname", "Ichigo");
        employeeDetails.put("lastname", "Kurosaki");
        employeeDetails.put("email", "ichigokurosaki@bleach.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstname", "Kisuke");
        employeeDetails2.put("lastname", "Urahara");
        employeeDetails2.put("email", "kisukeurahara@bleach.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeDetails);
        employeeList.add(employeeDetails2);

        try(FileWriter file = new FileWriter("EmployeeDetails.json")){
        file.write(employeeList.toJSONString());
        file.flush();
        }
        catch (IOException error){
            System.out.println(error);
        }


    }

}

/*
public class WriteToJson{

    public static void main(String[] args) {

        JSONObject employeedetails = new JSONObject();
        employeedetails.put("Username", "OneName");
        employeedetails.put("Password", "*****");
        employeedetails.put("Website", "phones.store.us");
        employeedetails.put("Email", "userisbuying@store.com");

        JSONArray phones = new JSONArray();
        phones.add("Oneplus");
        phones.add("Samsung");
        phones.add("Iphone");
        phones.add("Huawei");
        phones.add("Xiaomi");
        phones.add("Realme");

        employeedetails.put("Phones", phones);

        try (FileWriter writer = new FileWriter("Phones.json")){
            writer.write(employeedetails.toJSONString());
        }

        catch (Exception e){
            System.out.println(e);
        }

    }

}
*/
















