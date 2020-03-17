
package mypakge;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
      public static java.sql.Connection connect(){
          java.sql.Connection con=null;
          try{
              Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AnimalAid", "root", "");
                System.out.println("Connected");
          }
          catch(Exception e){
              e.printStackTrace();
          }
          return con;
      }
          public static void main(String ars[]){
          java.sql.Connection con=connect();
          System.out.println(con);
          System.out.println("Connected");
      }
    
    
}
