package entidad;
/**
 * 
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Documento
 */
public class Documento {
    //varible identificadora
    private int id;
    //varible que define el tipo de documento, este puede ser una boleta o factura
    private String tipo;
    //variable que representa la fecha en la que se realizó la compra o venta de libros
    private String fecha;

    /**
     * Constructor de la clase
     * @param id
     * @param tipo
     * @param fecha 
     */
    public Documento(int id, String tipo, String fecha) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public Documento(String tipo, String fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
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
}
