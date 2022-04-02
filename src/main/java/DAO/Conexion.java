
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo
    public Connection emparejarBD(){
        Connection cn=null;
        try {
            cn=DriverManager.getConnection("jdbc:sqlite:C:/Users/joya1/OneDrive/Escritorio/proyectoFinal/tabla.db");
        } catch (SQLException e) {
            System.out.println("Error 10"+e.getMessage());
        }
        return cn;
    }
    
    
}
