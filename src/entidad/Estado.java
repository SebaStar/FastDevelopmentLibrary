package entidad;

/**
 *
 * @author Paulina Delgado
 */
public class Estado {
    
    private int id;
    private String descripcion;

    public Estado(int id, String descripcion) {
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
