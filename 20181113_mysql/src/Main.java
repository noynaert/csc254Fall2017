import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String server = "turing.cs.missouriwestern.edu";
	    String user = "csc254";
	    String password = "age126";

	    ArrayList<Zip> places =  printZips(server, user, password);

    }
    public static ArrayList<Zip> printZips(String server, String user, String password){
        String connectionString = String.format("jdbc:mysql://%s/misc?user=%s&password=%s",server,user,password);
        String queryString =
                "SELECT city, state_prefix, zip_code,lat,lon from zips WHERE state_prefix LIKE 'MO' ORDER BY city";
        System.out.println(connectionString);
        System.out.println(queryString);
        ArrayList<Zip> list = new ArrayList();

        try {
            Connection connection = DriverManager.getConnection(connectionString);
            Statement allPlaces = connection.createStatement();
            ResultSet results = allPlaces.executeQuery(queryString);

            while(results.next()){
                String city = results.getString("city");
                String state = results.getString("state_prefix");
                String zip = results.getString("zip_code");
                double latitude = results.getDouble("lat");
                double longitude =results.getDouble("lon");
                Zip place = new Zip(city, state, zip);
                System.out.println(place);
                list.add(place);
            }


            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
