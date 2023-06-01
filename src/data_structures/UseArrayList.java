package data_structures;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    private static Properties prop;
    private static Connection connection;
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Blue");
        arrayList.add("Yellow");
        arrayList.add("Green");
        arrayList.add("White");
        arrayList.add("Red");

        System.out.println(arrayList.remove(4));


        System.out.println("The arrayList of colors using while loop is ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String colorName = iterator.next();
            System.out.print(colorName + ", ");


        }
        System.out.println(" ");

        System.out.println("The arrayList of colors using for each loop is ");
        for (String colorName : arrayList) {
            System.out.print(colorName + ", ");
        }

//    connection = getJDBCConnection();
//
//            if (connection != null) {
//        System.out.println("WE SUCCESSFULLY ESTABLISHED A JDBC CONNECTION!");
//    }
//    // Here I am retrieving Data from the DataBase 'world' table 'country'
//        String query = "SELECT * FROM country WHERE name = \"Anguilla\" and Region=\"Caribbean\"";
//
//    String insertQuery = "INSERT INTO country (name, region) VALUES ('Auooz', 'Pakistan');";
//
//    String retrieveQuery="SELECT* FROM country WHERE name =\"Auooz\" and region =\"Pakistan\"";
//
//
//
//    try {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(query);
//        ResultSetMetaData metaData = resultSet.getMetaData();
//        int columnCount = metaData.getColumnCount();
//
//        List<List<String>> results = new ArrayList<>();
//
//        while (resultSet.next()) {
//            List<String> row = new ArrayList<>();
//
//            for (int i = 1; i <= columnCount; i++) {
//                row.add(resultSet.getString(i));
//            }
//
//            results.add(row);
//        }
//
//        for (List<String> row : results) {
//            for (String value : row) {
//                System.out.print(value + "\t|");
//            }
//            System.out.println();
//        }
//
//    }
//    catch (SQLException e) {
//        throw new RuntimeException(e);
//    }
//
//}
//
//    public static Connection getJDBCConnection() {
//        prop = loadProperties();
//
//        if (prop != null) {
//            String driverClass = prop.getProperty("MYSQLJDBC.driver");
//            String host = prop.getProperty("MYSQLJDBC.host");
//            String user = prop.getProperty("MYSQLJDBC.userName");
//            String password = prop.getProperty("MYSQLJDBC.password");
//
//            try {
//                Class.forName(driverClass);
//            } catch (ClassNotFoundException cnfe) {
//                cnfe.printStackTrace();
//            }
//
//            try {
//                connection = DriverManager.getConnection(host, user, password);
//            } catch (SQLException sqle) {
//                System.out.println("Unable to establish connection to MYSQL database!");
//            }
//
//        } else {
//            System.out.println("Properties object is null");
//        }
//        return connection;
//    }
//
//    private static Properties loadProperties() {
//        prop = new Properties();
//        String propFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "secret.properties";
//
//        try (InputStream ism = new FileInputStream(propFilePath)) {
//            prop.load(ism);
//        } catch (FileNotFoundException fnfe) {
//            System.out.println("FILE IS NOT AVAILABLE AT: " + propFilePath);
//            fnfe.printStackTrace();
//        } catch (IOException ioe) {
//            throw new RuntimeException(ioe);
//        }
//
//        return prop;
    }




}
