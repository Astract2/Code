package CapaLogica;

/**
 *
 * @author JuanJ
 */
public class Persona {
    
    private int NroId;
    private int tipoId;
    private String Nombres;
    private String Apellidos;
    private String direccion;

    public Persona(int NroId, int tipoId, String Nombres, String Apellidos, String direccion) {
        this.NroId = NroId;
        this.tipoId = tipoId;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.direccion = direccion;
    }

    public int getNroId() {
        return NroId;
    }

    public void setNroId(int NroId) {
        this.NroId = NroId;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    
}
