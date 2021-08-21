import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritingToFile {

    public static void main(String[] args) {

        Country countryObj=new Country();
        countryObj.setName("Pakistan");
        countryObj.setPopulation(1000000);
        List listOfStates=new ArrayList();
        listOfStates.add("Punjab");
        listOfStates.add("Sindh");
        listOfStates.add("KPK");
        listOfStates.add("Balochistan");

        countryObj.setListOfStates(listOfStates);
        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(countryObj);

        try {
            //write converted json data to a file named "CountryGSON.json"
            FileWriter writer = new FileWriter("src/CountryGSON.json");
            writer.write(json);
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);

    }
}

