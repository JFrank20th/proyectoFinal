package DAO;

import Modelo.Estudiante;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
//conectar con la base de datos

public class DaoEstudiante {

    private Statement sentencia = null;
    private ResultSet resultado = null;
    Conexion cx = new Conexion();


    public void registrar(Estudiante est) {

        Connection cn = cx.emparejarBD();
        if (cn != null) {
            String registros = "(Nombres,Apellidos,Fechas_nacimiento,Correo_inst,Correo_pers,Celular,Fijo,Programa)";
            String valores = "('" + est.getNombres() + "','"
                    + est.getApellidos() + "','"
                    + est.getFechaNacimiento() + "','"
                    + est.getCorreoInstitucional() + "','"
                    + est.getCorreoPersonal() + "',"
                    + est.getNumTelCelular() + ","
                    + est.getNumTelFijo() + ",'"
                    + est.getProgramaAcademico() + "')";

            //concatenar
            String query = "INSERT INTO estudiantes " + registros + "VALUES" + valores;

            try {
                PreparedStatement consultaDB = cn.prepareStatement(query);
                consultaDB.execute();
                consultaDB.close();
            } catch (Exception e) {
                System.out.println("Error 1" + e);
            }

        } else {
            System.out.println("Error de coneccion 2");
        }

    }

    public void modificar(String correo, Estudiante est) {

        Connection cn = cx.emparejarBD();
        if (cn != null) {
            //UPDATE estudiantes
            //SET Correo_pers='',Celular= , Fijo= , Programa=''
            //WHERE Correo_inst=''
            String query = "UPDATE estudiantes SET Correo_pers='" + est.getCorreoPersonal()
                    + "',Celular=" + est.getNumTelCelular() + ",Fijo=" + est.getNumTelFijo() + ",Programa='"
                    + est.getProgramaAcademico() + "' WHERE Correo_inst='"
                    + correo + "'";

            try {
                PreparedStatement consultaDB = cn.prepareStatement(query);
                consultaDB.execute();
                consultaDB.close();
            } catch (Exception e) {
                System.out.println("Error 3" + e);
            }

        } else {
            System.out.println("Error de coneccion 4");
        }

    }

    public void eliminar(String correo) {
        Connection cn = cx.emparejarBD();
        if (cn != null) {
            //DELETE FROM estudiantes WHERE Correo_inst='dhf'
            String query = "DELETE FROM estudiantes WHERE Correo_inst='" + correo + "'";

            try {
                PreparedStatement consultaDB = cn.prepareStatement(query);
                consultaDB.execute();
                consultaDB.close();
            } catch (Exception e) {
                System.out.println("Error 5" + e);
            }

        } else {
            System.out.println("Error de coneccion 6");
        }

    }
    
    
    

}
