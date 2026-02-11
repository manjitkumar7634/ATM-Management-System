package bank_managment_system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conection {
   
     Statement stmt;
     Connection con;
     public Conection(){
    
        try{
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankMangment", "root", "manjit@123");
              stmt= con.createStatement();
        }catch(Exception e1){
          e1.printStackTrace();
        }
        
    }
}
    


