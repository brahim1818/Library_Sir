
package My_Classes;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/**
 *
 * @author you
 */
public class DB {
    
    
    // create a connection between the project & mysql database
    // 1- download the java-mysql connector
    // 2- add the jar file to the project
    
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "java_library_system";
    private static Integer portNumbre = 3306;
    private static String pass= ""; // no password

    // create a function to create & return the connection
    
    public static Connection getConnection(){
        
        Connection connection=null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(serverName);
        datasource.setUser(userName);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumbre);
        datasource.setPassword(pass);
        
        
        try {
            connection = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }



        
        
        return connection;
        
    }


}
