
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class javaconnect {
    Connection conn;
    
    public static Connection ConnectDB(){
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\Digital Library\\nbproject\\DigitalLibrary.sqlite");
        return conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    }
        
}
