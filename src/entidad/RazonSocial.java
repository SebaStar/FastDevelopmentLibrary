package entidad;
/**
 * Clase representativa de una razón social
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: RazonSocial
 */
public class RazonSocial {
    private int id;
    //variable que almacena el rut de los usuarios de la biblioteca(trabajador,cliente,distribuidor)
    private String rut;
    //variable que almacena el nombre del usuario de la biblioteca
    private String nombre;
    //variable que almacena el rol del usuario
    private String rol;

    /**
     * Constructor de la clase
     * @param id
     * @param rut
     * @param nombre 
     * @param rol
     */
    public RazonSocial(int id, String rut, String nombre, String rol) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.rol = rol;
    }

    public RazonSocial(String rut, String nombre, String rol) {
        this.rut = rut;
        this.nombre = nombre;
        this.rol = rol;
    }

    public RazonSocial(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getRol() {
        return rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
}
