import io.restassured.path.json.JsonPath;
import okhttp3.*;
import java.io.IOException;

public class WeatherAPI {
    public static void main(String[] args) throws IOException {

        getWeather();

    }

    public static void getWeather(){
        try {
            String hostname = "http://api.weatherstack.com";
            String endpoint = "/current?access_key=3bec97ab5239d23224bf6804fa5c2a47&query=New York";
            String url = hostname + endpoint;

            OkHttpClient client = new OkHttpClient.Builder().build();

//            MediaType mediaType = MediaType.parse("application/json");
//
//            RequestBody Body = RequestBody.create(mediaType, "access_key=3bec97ab5239d23224bf6804fa5c2a47&query=New York");

            Request request = new Request.Builder()
                    .url(url)
                    .method("GET", (RequestBody)null)
                    .build();

            Response response = client.newCall(request).execute();

            String responseBody = response.body().string();

            System.out.println(responseBody);
        }
        catch (Exception error){
            System.out.println(error);
        }
    }
}

