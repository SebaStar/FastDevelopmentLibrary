package entidad;

/**
 *
 * @author Paulina Delgado
 */
public class Editorial {
    
    private int id;
    private String nombre;

    public Editorial(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
