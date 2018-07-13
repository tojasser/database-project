/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
/**
 *
 * @author talal
 */
public class coonection {
     Connection connect = null;
    public Connection getConnection(){
        System.out.println(" mysql Tasting");
         try{
           Class.forName("com.mysql.jdbc.Driver");
           connect= DriverManager.getConnection("jdbc:mysql://Localhost/trans?user=root&password=house200");
         }catch(Exception ex){
             System.out.println("connection ereor ");
             ex.printStackTrace();
             
         }
         return connect;
    }

  
    public static void main(String[] args) {
       Connection connect = null;
       Statement statement=null;
       PreparedStatement prepareStatement=null;
       ResultSet resultSet= null;
       
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           connect= DriverManager.getConnection("jdbc:mysql://Localhost/trans?user=root&password=house200");
           statement= connect.createStatement();
           
         resultSet=statement.executeQuery("select * from admin");
         String user;
         String pass;
         while(resultSet.next()){
             user= resultSet.getString("USER_NAME");
             pass= resultSet.getString("PASSWORD");
             System.out.println(user+ pass);
         }
             
           
       }catch(Exception e){
           
       }
       
      
           
           
           
           }
    
}
