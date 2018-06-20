package entidad;

/**
 *
 * @author Paulina Delgado
 */
public class Autor {
    
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Autor(int id, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
}
