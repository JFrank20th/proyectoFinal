
package Modelo;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correoInstitucional;
    private String correoPersonal;
    private long numTelCelular;
    private long numTelFijo;
    private String programaAcademico;
    
    //constructor

    public Estudiante(String nombres, String apellidos, String fechaNacimiento, String correoInstitucional, String correoPersonal, long numTelCelular, long numTelFijo, String programaAcademico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.numTelCelular = numTelCelular;
        this.numTelFijo = numTelFijo;
        this.programaAcademico = programaAcademico;
    }
    
    //constructor vacio

    public Estudiante() {
    }
    

    
    //get y set para acceder a los atribustos de esta clase desde otra clase
    //get trae informacion
    //set envia informacion
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public long getNumTelCelular() {
        return numTelCelular;
    }

    public void setNumTelCelular(long numTelCelular) {
        this.numTelCelular = numTelCelular;
    }

    public long getNumTelFijo() {
        return numTelFijo;
    }

    public void setNumTelFijo(long numTelFijo) {
        this.numTelFijo = numTelFijo;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
    
    
}
