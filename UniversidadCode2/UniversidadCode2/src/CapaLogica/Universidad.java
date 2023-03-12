/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanJ
 */
public class Universidad {
    private List<Estudiante> estudiantes;
    private List<Docente> profesores;
    private List<Administrativo> administrativos;

    public Universidad() {
        estudiantes = new ArrayList<>();
        
        Estudiante estudiante1 = new Estudiante(1234, 1, 1, "Juan", "Pérez", "Calle 123");
        Estudiante estudiante2 = new Estudiante(5678, 2, 1, "María", "González", "Avenida 456");
        Estudiante estudiante3 = new Estudiante(9012, 3, 2, "Pedro", "Martínez", "Calle 789");
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        profesores = new ArrayList<>();
        Docente docente1 = new Docente("Informática", 1, 1, "Carlos", "García", "Carrera 10");
        Docente docente2 = new Docente("Matemáticas", 2, 1, "Ana", "López", "Calle 7");
        Docente docente3 = new Docente("Inglés", 3, 2, "Sara", "Ramírez", "Avenida 20");
        profesores.add(docente1);
        profesores.add(docente2);
        profesores.add(docente3);

        administrativos = new ArrayList<>();
        Administrativo admin1 = new Administrativo(1000000, 4, 1, "Mario", "Rodríguez", "Calle 15");
        Administrativo admin2 = new Administrativo(2000000, 5, 2, "Lucía", "Sánchez", "Avenida 30");
        Administrativo admin3 = new Administrativo(1500000, 6, 1, "Juan", "Gómez", "Carrera 5");
        administrativos.add(admin1);
        administrativos.add(admin2);
        administrativos.add(admin3);
        
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarProfesor(Docente profesor) {
        profesores.add(profesor);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        administrativos.add(administrativo);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public void eliminarProfesor(Docente profesor) {
        profesores.remove(profesor);
    }

    public void eliminarAdministrativo(Administrativo administrativo) {
        administrativos.remove(administrativo);
    }



    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Docente> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Docente> profesores) {
        this.profesores = profesores;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(List<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }
    
 
}