package entidad;
/**
 * Clase que representa a una persona real que distribuye (vende) libros a la biblioteca
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Distribuidor
 */
public class Distribuidor {
    //variable de identificación única
    private int id;
    //variable que representa el año en que el distribuidor comezó a venderle libros a la biblioteca
    private int añoInicio;
    //variable que recibe el id de la razón social asociada
    private int razonSocialId;
    
    /**
     * Constructor de la clase
     * @param id
     * @param añoInicio
     * @param razonSocialId 
     */
    public Distribuidor(int id, int añoInicio, int razonSocialId) {
        this.id = id;
        this.añoInicio = añoInicio;
        this.razonSocialId = razonSocialId;
    }

    public Distribuidor(int añoInicio, int razonSocialId) {
        this.añoInicio = añoInicio;
        this.razonSocialId = razonSocialId;
    }

    public int getId() {
        return id;
    }

    public int getAñoInicio() {
        return añoInicio;
    }

    public int getRazonSocialId() {
        return razonSocialId;
    }
}
