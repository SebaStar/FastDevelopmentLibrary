package entidad;

/**
 *
 * @author Paulina Delgado
 */
public class MetodoPago {
    
    private int id;
    private String descripcion;

    public MetodoPago(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
