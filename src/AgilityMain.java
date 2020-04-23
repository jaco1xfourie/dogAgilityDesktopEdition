
/*
Created by Jaco1xFourie
Current update: 23 April 2020
Test connection to MySQLDatabase
 */

import java.sql.Connection;
import java.sql.SQLException;

public class AgilityMain {

    public static void main(String[] args) {

        //testing connection to database
        try (Connection conn = MySQLJDBCUtility.getConnection()){
            // if successful connection
            System.out.println(String.format("Connected to database %s " + "successfully.",conn.getCatalog()));
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        } //end try catch


    } //End method Main()

} //End class Agility
