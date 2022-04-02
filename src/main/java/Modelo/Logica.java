
package Modelo;

import DAO.DaoEstudiante;
import java.sql.SQLException;
import java.util.ArrayList;


public class Logica {
    DaoEstudiante daoSQL= new DaoEstudiante();
    public void RegistroBd(Estudiante estudiante){
        daoSQL.registrar(estudiante);
    }
    
    public void borrarDb(String correo){
        daoSQL.eliminar(correo);
    }
     public void modificarDb(String correo, Estudiante est){
         daoSQL.modificar(correo, est);
     }
}
