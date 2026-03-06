package modelo;

public class Curso {

    private int idCurso;
    private String nombre;
    private String profesor;
    private int creditos;

    public Curso() {}

    public Curso(String nombre, String profesor, int creditos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}   
