import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class WriteYAMLFile {

    public static void main(String[] args) throws IOException {

        Map<String, String> developers = new HashMap<>();

        developers.put("FirstName", "Peter");
        developers.put("LastName", "Parker");
        developers.put("Position", "Developer");
        developers.put("Wage", "1600");

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        objectMapper.writeValue(new File("file.yaml"), developers);

    }
}
