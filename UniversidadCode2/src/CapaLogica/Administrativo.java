package CapaLogica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanJ
 */
public class Administrativo extends Persona {
    private int Salario;
    private List<Administrativo> administrativos = new ArrayList<>();

    public Administrativo(int Salario, int NroId, int tipoId, String Nombres, String Apellidos, int direccion) {
        super(NroId, tipoId, Nombres, Apellidos, direccion);
        this.Salario = Salario;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    public void agregarAdministrativo(Administrativo administrativo) {
        
    administrativos.add(administrativo);
}

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(List<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }
    
}
