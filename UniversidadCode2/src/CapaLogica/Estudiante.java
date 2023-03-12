package CapaLogica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanJ
 */
public class Estudiante extends Persona {
    private int codigo;
    
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Estudiante(int codigo, int NroId, int tipoId, String Nombres, String Apellidos, int direccion) {
        super(NroId, tipoId, Nombres, Apellidos, direccion);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        
    estudiantes.add(estudiante);
}

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}