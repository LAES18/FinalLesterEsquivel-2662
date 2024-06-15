import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private int calificacion;

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public static void agregarEstudiantes(List<Estudiante> listaEstudiantes) {
        for (int i = 1; i <= 5; i++) {
            Estudiante estudiante = new Estudiante("Estudiante" + i, i * 10);
            listaEstudiantes.add(estudiante);
        }
    }

    public static void mostrarEstudiantes(List<Estudiante> listaEstudiantes) {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + " - Calificacion: " + estudiante.getCalificacion());
        }
    }

    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        agregarEstudiantes(listaEstudiantes);
        mostrarEstudiantes(listaEstudiantes);
    }
}

