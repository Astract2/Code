package CapaLogica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanJ
 */
public class Docente extends Persona {
    
    private String Escalafon;
    

    public Docente(String Escalafon, int NroId, int tipoId, String Nombres, String Apellidos, String direccion) {
        super(NroId, tipoId, Nombres, Apellidos, direccion);
        this.Escalafon = Escalafon;
    }

    public String getEscalafon() {
        return Escalafon;
    }

    public void setEscalafon(String Escalafon) {
        this.Escalafon = Escalafon;
    }
    
}
