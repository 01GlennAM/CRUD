
package Config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;



public class Conexion {
    String bd="persona";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection con;
    
    public  Conexion(){
        try {
            Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url+bd,user,password);
            System.out.println("se conecto a la base de datos "+ bd);// para saber si conecto 
        } catch (Exception e) {
            System.out.println("no se conecto a base de datos "+bd);
        }
            
    }

    public Connection getConnection() { 
        return con; }
      
    }    

