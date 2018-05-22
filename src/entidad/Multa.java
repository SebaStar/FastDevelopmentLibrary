package entidad;
/**
 * Clase que hace referencia a un cargo de servicio por no entregar el libro a tiempo
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Multa
 */
public class Multa {
    //variable de identificación
    private int id;
    //variable que registra los dias de atraso en la entrega de un libro
    private int diasAtraso;
    //variable que representa el valor en pesos del cargo por servicio
    private int multa;
    //variable que recibe el id del arriendo asociado
    private int arriendoId;

    /**
     * Constructor de la clase
     * @param id
     * @param diasAtraso
     * @param multa
     * @param arriendoId 
     */
    public Multa(int id, int diasAtraso, int multa, int arriendoId) {
        this.id = id;
        this.diasAtraso = diasAtraso;
        this.multa = multa;
        this.arriendoId = arriendoId;
    }

    public Multa(int diasAtraso, int multa, int arriendoId) {
        this.diasAtraso = diasAtraso;
        this.multa = multa;
        this.arriendoId = arriendoId;
    }

    public int getId() {
        return id;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public int getMulta() {
        return multa;
    }

    public int getArriendoId() {
        return arriendoId;
    }
}
