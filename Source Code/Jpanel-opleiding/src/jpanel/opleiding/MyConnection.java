/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel.opleiding;
// Java program to check if an email address 
// is valid using Regex. 
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author singh
 */
public class MyConnection {
       // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stagedb?"
                            + "user=root&password=");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}    

