
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost/bd_ventas";
    String user="root";
    String pass="";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}
