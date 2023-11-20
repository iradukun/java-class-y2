package ac.rca.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String URL="jdbc:mysql://localhost:3306/rca_db";
    private static final String USERNAME="mustapha";
    private static final String PASSWORD="123";

    public static  Connection getConnection() {

        try{
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(SQLException E){

            E.printStackTrace();
            return null;

        }
        

    }
    

}
