package entidad;
/**
 * 
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Movimiento
 */
public class Movimiento {
    private int id;
    //varible que define el tipo de movimiento, este puede ser: compra, venta o arriendo
    private String tipo;
    //varaible correspondiente a la fecha en la que se realiza el movimiento
    private String fecha;
    //variable que recibe el id del documento asociado
    private int documentoId;

    /**
     * Constructor de la clase
     * @param id
     * @param tipo
     * @param fecha 
     * @param documentoId
     */
    public Movimiento(int id, String tipo, String fecha, int documentoId) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.documentoId = documentoId;
    }

    public Movimiento(String tipo, String fecha, int documentoId) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.documentoId = documentoId;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getDocumentoId() {
        return documentoId;
    }
    
    public void setDocumentoId(int documentoId) {
        this.documentoId = documentoId;
    }
}
