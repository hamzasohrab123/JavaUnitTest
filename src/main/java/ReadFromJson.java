import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

        public class ReadFromJson
        {
            public static void main(String[] args)
            {
                //JSON parser object to parse read file
                JSONParser jsonParser = new JSONParser();

                try (FileReader fileReader = new FileReader("EmployeeDetails.json"))
                {
                    //Read JSON file
                    Object obj = jsonParser.parse(fileReader);

                    JSONArray employeeList = (JSONArray) obj;
                    System.out.println(employeeList);

                }
                catch (FileNotFoundException error) {
                    System.out.println(error);;
                }
                catch (IOException error) {
                    System.out.println(error);;
                }
                catch (ParseException error) {
                    System.out.println(error);
                }
            }

        }

/*

//This is new code which is printing values too and has option to either print keys or values
public class ReadFromJson {

        public static void main(String[] args) {

            JSONParser parser = new JSONParser();

            try (FileReader read = new FileReader("test3.json")){
                Object obj = parser.parse(read);

                JSONObject jsonobject = (JSONObject) obj;
                String email = jsonobject.get("Email").toString();
                System.out.println(email);

                Set<Object> keySet = jsonobject.keySet();
                for(Object ks : keySet){
                    String k = (String)ks;
                    Object kv = jsonobject.get(k);
                    System.out.println(k + kv);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

*/

























