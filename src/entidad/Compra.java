package entidad;

/**
 *
 * @author Paulina Delgado
 */
public class Compra {
    
    private int id;
    private int precio;
    private int serie;
    private int folioFactura;    

    public Compra(int id, int precio, int serie, int folioFactura) {
        this.id = id;
        this.precio = precio;
        this.serie = serie;
        this.folioFactura = folioFactura;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public int getSerie() {
        return serie;
    }

    public int getFolioFactura() {
        return folioFactura;
    }
}
