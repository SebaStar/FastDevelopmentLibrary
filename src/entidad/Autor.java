package entidad;
/**
 * Clase que representa a una persona real, autor/a de un libro
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Autor
 */
public class Autor {
    //varible de identificación única
    private int id;
    //variable que almacena el nombre del autor
    private String nombre;
    //variable que almacena el apellido paterno del autor
    private String apellidoPaterno;
    //variable que almacena el apellido materno del autor
    private String apellidoMaterno;

    /**
     * Constructor de la clase
     * @param id
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno 
     */
    public Autor(int id, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Autor(String nombre, String apellidoPaterno, String apellidoMaterno) {
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

    /**
     * Metodo para mostrar contenido de la clase
     * @return Retorna un String con el nombre completo del autor
     */
    @Override
    public String toString() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}
