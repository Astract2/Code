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

    public Administrativo(int Salario, int NroId, int tipoId, String Nombres, String Apellidos, String direccion) {
        super(NroId, tipoId, Nombres, Apellidos, direccion);
        this.Salario = Salario;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    
    
}
