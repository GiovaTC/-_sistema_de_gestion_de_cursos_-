package dao;

import modelo.Curso;
import util.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CursoDAO {

    public void guardarCurso(Curso curso) {

        String sql = """
                INSERT INTO CURSOS
                (NOMBRE, PROFESOR, CREDITOS)
                VALUES (?, ?, ?)
                """;
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, curso.getNombre());
            ps.setString(2, curso.getProfesor());
            ps.setInt(3, curso.getCreditos());

            ps.executeUpdate();

            System.out.println("curso registrado exitosamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}   
