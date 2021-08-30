import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadYAMLFile {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        try {
            User user = objectMapper.readValue(new File("src/main/java/check.yaml"), User.class);
            System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
        }
        catch (Exception error){
            System.out.println(error);
        }
    }
}
