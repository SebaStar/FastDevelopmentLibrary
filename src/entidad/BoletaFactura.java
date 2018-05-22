package entidad;
/**
 * Clase representativa de una Boleta o Factura
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación:  27 de Junio,2017
 * Nombre de la clase: BoletaFactura
 */
public class BoletaFactura {
    //variable identificadora
    private int id;
    //variable correspondiente al tipo de contacto:
    private String tipo;
    //
    private String folio;
    //
    private int neto;
    //
    private int iva;
    //
    private String metodoPago;
    //
    private int documentoId;

    /**
     * Constructor de la clase
     * @param id
     * @param tipo
     * @param folio
     * @param neto
     * @param iva
     * @param metodoPago
     * @param documentoId 
     */
    public BoletaFactura(int id, String tipo, String folio, int neto, int iva, String metodoPago, int documentoId) {
        this.id = id;
        this.tipo = tipo;
        this.folio = folio;
        this.neto = neto;
        this.iva = iva;
        this.metodoPago = metodoPago;
        this.documentoId = documentoId;
    }

    public BoletaFactura(String tipo, String folio, int neto, int iva, String metodoPago, int documentoId) {
        this.tipo = tipo;
        this.folio = folio;
        this.neto = neto;
        this.iva = iva;
        this.metodoPago = metodoPago;
        this.documentoId = documentoId;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFolio() {
        return folio;
    }

    public int getNeto() {
        return neto;
    }

    public int getIva() {
        return iva;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public int getDocumentoId() {
        return documentoId;
    }
}
