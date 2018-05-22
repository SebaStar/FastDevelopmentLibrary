package entidad;
/**
 * Clase que identifica a una persona real, ya sea cliente o trabajador de la biblioteca
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Persona
 */
public class Persona {
    //variable de identificación
    private int id;
    //variable que almacena el apellido paterno de un cliente o trabajador
    private String apellidoPaterno;
    //variable que almacena el apellido materno de un cliente o trabajador
    private String apellidoMaterno;
    //variable que recibe el id de la razón social asociada   
    private int razonSocialId;

    /**
     * Constructor de la clase
     * @param id
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param razonSocialId 
     */
    public Persona(int id, String apellidoPaterno, String apellidoMaterno, int razonSocialId) {
        this.id = id;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.razonSocialId = razonSocialId;
    }

    public Persona(String apellidoPaterno, String apellidoMaterno, int razonSocialId) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.razonSocialId = razonSocialId;
    }

    public int getId() {
        return id;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getRazonSocialId() {
        return razonSocialId;
    }
}
