package util;

import servicio.CursoServicio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CursoServicio servicio = new CursoServicio();

        System.out.println("===== SISTEMA DE CURSOS =====");

        System.out.print("Nombre del curso: ");
        String nombre = sc.nextLine();

        System.out.print("Profesor: ");
        String profesor = sc.nextLine();

        System.out.print("Creditos: ");
        int creditos = sc.nextInt();

        servicio.registrarCurso(nombre, profesor, creditos);

        System.out.println("Operacion finalizada");
    }
}   