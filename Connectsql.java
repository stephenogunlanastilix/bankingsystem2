/*  Code Reference - https://www.youtube.com/watch?v=2_EydV6EYt0&list=PL4OYVwyd_80ow3KLiePwXdSd_Lmxa-jpN&index=4 */

 /* Connectsql class create a connection to database , disconnects , 
 * and also execute sql commands  in the database
 */
package bankingsystem;

//IMports neccesary Sql libraries
import java.sql.Connection;		//provides methods for creating statement and managing connections
import java.sql.DriverManager;	//makes a connection with a driver
import java.sql.ResultSet;		//retrieve and update the results of a sql query
import java.sql.SQLException;	//thrown when there is a problem accessing data
import java.sql.Statement;		//used to send basic SQL statements



public class Connectsql {	//create class

    public Statement stm; 	//instance variables
    public ResultSet rs;
    public Connection conn;
    //Assign driver String to driver location
    private  final String driver = "org.mysql.Driver"; 	//unique to this class and cannot be inherited
    //Assign roots to location and name of database name
    private  final String root = "jdbc:mysql://127.0.0.1/bankingsystem";	
    //Assigns the user String to database username
    private  final String user = "root";
    //Assign password String to database password (the password string is empty because the local server doesn't have a password)
    private  final String pass = "";
   
    
    /*
     * Creates connection to database , username and password then throws an error if it fails to connect
     */
    public void connect(){
    	try {
	    	System.setProperty("jdbc.Driver", driver); 
	    	conn = DriverManager.getConnection(root,user,pass); //creates the connection
	    	System.out.println("Successfull");
       	}
    	 catch (SQLException e) {		//the catch block will display a SQL exception
    		System.out.println("Error" + e);
    	 }
    }
    /*
     * Disconnect database by closing connection and throws an error if it fails to disconnect
     */
    public void disconnect(){
    	try {
    		conn.close();
    	}
    	catch(Exception e) {
    		System.out.println("Error" + e);
    	}
    }
    /*
     * Exceute the sql by declaring the statement and Assign it to the result set to execute
     */
    public void executesql(String SQL) {
    	try {
    		stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
    		rs = stm.executeQuery(SQL);
    	}
    	catch(Exception e) {
    		System.out.println("Error" + e);
    	}
    }
    /*
     * Tries out the connection if its working
     */
	public static void main(String[] args) {
		Connectsql connection = new Connectsql(); //creates an object of the class
		connection.connect();
	}
}
