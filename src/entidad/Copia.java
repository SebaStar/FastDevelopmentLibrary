package entidad;
/**
 * Clase representativa de una copia de Libro
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Copia
 */
public class Copia {
    //varible identificadora de una copia
    private int id;
    private String numeroSerie;
    //variable que representa el estado de un copia de Libro, puede ser disponible, arrendado o vendido.
    private String estado;
    //variable que recibe el id del libro
    private int libroId;

    /**
     * Constructor de la clase
     * @param id
     * @param numeroSerie
     * @param estado
     * @param libroId 
     */
    public Copia(int id, String numeroSerie, String estado, int libroId) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.estado = estado;
        this.libroId = libroId;
    }

    public Copia(String numeroSerie, String estado, int libroId) {
        this.numeroSerie = numeroSerie;
        this.estado = estado;
        this.libroId = libroId;
    }

    public int getId() {
        return id;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getEstado() {
        return estado;
    }

    public int getLibroId() {
        return libroId;
    }
}
