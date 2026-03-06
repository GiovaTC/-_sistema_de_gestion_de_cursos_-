package servicio;

import dao.CursoDAO;
import modelo.Curso;

public class CursoServicio {

    private CursoDAO cursoDAO = new CursoDAO();

    public void registrarCurso(String nombre, String profesor, int creditos) {

        Curso curso = new Curso(nombre, profesor, creditos);

        cursoDAO.guardarCurso(curso);
    }
}   
