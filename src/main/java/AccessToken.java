import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import okhttp3.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

    public class AccessToken {
        public static void main(String[] args) throws IOException {

            submitToken();

        }

        public static String getToken() throws IOException {

            String token = null;

            String hostname = "https://izaan-test.auth.us-east-1.amazoncognito.com";
            String endpoint = "/oauth2/token";
            String url = hostname + endpoint;

            //This is making the new client
            OkHttpClient client = new OkHttpClient.Builder().build();

            //What type of data are we sending in
            MediaType mediatype = MediaType.parse("application/x-www-form-urlencoded");

            //What is the Content/Body
            RequestBody body = RequestBody.create(mediatype, "scope=izaan_test/post_info&grant_type=client_credentials");

            //Enter the username and password in Base64 Coding
            String encoding = Base64.getEncoder().encodeToString(("1u5io4va9sr45n79fceg2damjf:1qbkthvp7lbc7aavuhhmfg8f2crekor9h2h7abu2oru1nlpj71fe").getBytes("UTF-8"));

            //Entering the Authorization
            String auth = "Basic " + encoding;
            System.out.println(auth);

            //Completing our Request
            Request request = new Request.Builder()
                    .url(url)
                    .method("POST", body)
                    .addHeader("Authorization", auth)
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            Response response = client.newCall(request).execute();
            System.out.println(response);

            //Convert responseBody as String in JsonBody
            String responseBody = response.body().string();
            System.out.println(responseBody);

            //Convert String jsonBody to JsonPath object
            JsonPath jsonPath = new JsonPath(responseBody);

            //This will print the token in simple format
            token = jsonPath.get("access_token");
//            System.out.println(token);

            client.connectionPool().evictAll();
            return token;

        }

        public static void submitToken() throws IOException {

            String url = "https://5x9m5ed0tj.execute-api.us-east-1.amazonaws.com/test/submit";
            String path = new String(Files.readAllBytes(Paths.get("submit.json")));

            RequestSpecification requestSpecification = given().body(path);
            requestSpecification.contentType(ContentType.JSON);
            requestSpecification.header("Authorization", getToken());
            io.restassured.response.Response response = requestSpecification.post(url);

            //Convert responseBody as String in JsonBody
            String responseBody = response.asString();
            System.out.println(responseBody);

            //Convert String jsonBody to JsonPath object
            JsonPath jsonPath = new JsonPath(responseBody);

            //This will print the token in simple format
            String mess = jsonPath.get("message");
//            System.out.println(mess);

        }
    }



















