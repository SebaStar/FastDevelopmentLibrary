package entidad;
/**
 * Clase representativa del arriendo de libros
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Arriendo
 */
public class Arriendo {
    //variable identificadora
    private int id;
    //variable que indica la fecha máxima de devolución del libro
    private String fechaTermino;
    //variable que representa la fecha en la que el libro fue devuelto a la biblioteca
    private String fechaDevolucion;
    //variable que recibe el id del documento asociado
    private int documentoId;

    /**
     * Constructor de la clase
     * @param id
     * @param fechaTermino
     * @param fechaDevolucion
     * @param documentoId 
     */
    public Arriendo(int id, String fechaTermino, String fechaDevolucion, int documentoId) {
        this.id = id;
        this.fechaTermino = fechaTermino;
        this.fechaDevolucion = fechaDevolucion;
        this.documentoId = documentoId;
    }

    public Arriendo(String fechaTermino, String fechaDevolucion, int documentoId) {
        this.fechaTermino = fechaTermino;
        this.fechaDevolucion = fechaDevolucion;
        this.documentoId = documentoId;
    }

    public int getId() {
        return id;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getDocumentoId() {
        return documentoId;
    }

    @Override
    public String toString() {
        return "Arriendo{" + "id=" + id + ", fechaTermino=" + fechaTermino + ", documentoId=" + documentoId + '}';
    }
    
}
