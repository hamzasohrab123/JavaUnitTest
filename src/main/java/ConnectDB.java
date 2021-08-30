import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectDB {
    public static void main(String[] args) throws SQLException {

         String username = "postgres";
         String password = "postgres2101";
         String hostname = "database-1.cen58y5cse53.us-east-1.rds.amazonaws.com";
         String portnumber = "5432";
         String database = "dvdrental";
         String query = "SELECT actor_id, first_name, last_name, last_update FROM public.actor";

        // jdbc:postgresql://host:port/database
        //jdbc:postgresql is the protocol for postgres
        String url = "jdbc:postgresql://" + hostname + ":" + portnumber + "/" + database;

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        //ResultSet is table of data representing database result set and is used to store data after the query is executed
        ResultSet resultSet = statement.executeQuery(query);

        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        while (resultSet.next()) {
            map.put("actor_id", resultSet.getString("actor_id"));
            map.put("first_name", resultSet.getString("first_name"));
            map.put("last_name", resultSet.getString("last_name"));
            map.put("last_update", resultSet.getString("last_update"));
            list.add(map);

//            System.out.println(list);
//            System.out.println("\n");

        }

        //this will get the total size of table, name and update of last member of the table
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

    }
}

/*
import java.sql.*;

public class ConnectDB {

    private final String url = "jdbc:postgresql://localhost:5432/dvdrental";
    private final String user = "postgres";
    private final String password = "drogba11";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void getActors() {

        String SQL = "SELECT actor_id,first_name, last_name FROM actor";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            // display actor information
            displayActor(rs);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getActorCount() {
        String SQL = "SELECT count(*) FROM actor";
        int count = 0;

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return count;
    }

    private void displayActor(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("actor_id") + "\t"
                    + rs.getString("first_name") + "\t"
                    + rs.getString("last_name"));

        }
    }

    public void findActorByID(int actorID) {
        String SQL = "SELECT actor_id,first_name,last_name "
                + "FROM actor "
                + "WHERE actor_id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, actorID);
            ResultSet rs = pstmt.executeQuery();
            displayActor(rs);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        ConnectDB connect = new ConnectDB();
//        connect.findActorByID(200);
//        connect.getActorCount();
        connect.getActors();
    }
}

*/



















