package entidad;
/**
 * Clase referencial a la empresa que se dedica a editar y reproducir libros 
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Editorial
 */
public class Editorial {
    //variable identificadora
    private int id;
    //variable que almacena el nombre de la editorial
    private String nombre;

    /**
     * Constructor de la clase
     * @param id
     * @param nombre 
     */
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

    @Override
    public String toString() {
        return nombre;
    }
}
