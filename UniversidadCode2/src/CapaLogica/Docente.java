package CapaLogica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanJ
 */
public class Docente extends Persona {
    
    private int Escalafon;
    private List<Docente> docentes =new ArrayList<>();  

    public Docente(int Escalafon, int NroId, int tipoId, String Nombres, String Apellidos, int direccion) {
        super(NroId, tipoId, Nombres, Apellidos, direccion);
        this.Escalafon = Escalafon;
    }

    public int getEscalafon() {
        return Escalafon;
    }
    
    public void agregarDocente(Docente docente ){
        docentes.add(docente);
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }
   
    
}
