package entidad;
/**
 * Clase que representa la categoria a la que pertenece un libro.
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Categoria
 */
public class Categoria {
    //variable de identificación
    private int id;
    //variable correspondiente al nombre de la categoría
    private String nombre;

    /**
     * Constructor de la clase
     * @param id
     * @param nombre 
     */
    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
