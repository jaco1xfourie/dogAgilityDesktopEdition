import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
Created by Jaco1xFourie
Date 23 April 2020
 */

public class MySQLJDBCUtility {

    /**
     *
     * Get the database connection
     * @return a Connection object
     * @throw SQLException
     */

    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        try(FileInputStream f = new FileInputStream("./resources/db.properties")){

            //load the properties file
            Properties props = new Properties();
            props.load(f);

            //assign database parameters from propfile
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            //create the connection to db
            conn = DriverManager.getConnection(url,user,password);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return conn;

    } // End method getConnection()


} // End Class
