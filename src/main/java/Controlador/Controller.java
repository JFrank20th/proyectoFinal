
package Controlador;

import Modelo.Estudiante;
import Modelo.Logica;
import java.sql.SQLException;
import java.util.ArrayList;


public class Controller {
    Logica lg = new Logica();
    
    public void registroBD(Estudiante est){
        lg.RegistroBd(est);
    }
    
    public void borrarDb(String correo){
        lg.borrarDb(correo);
        
    }
    public void modificarDb(String correo, Estudiante est){
        lg.modificarDb(correo, est);
    }
    
}
