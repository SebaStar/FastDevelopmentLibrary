package entidad;
/**
 * Clase que representa un Libro 
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Libro
 */
public class Libro {
    //variable de identificación 
    private int id;
    //variable que representa el Número Estándar Internacional de Libros
    private String isbn;
    //variable que almacena el titulo del libro
    private String titulo;
    //variable que almacena el idioma del libro
    private String idioma;
    //variable representativa a la cantidad de páginas que posee el libro
    private int numeroPaginas;
    //variable que representa el precio real del libro
    private int precioReferencia;
    //variable que almacena el año en que el libro fue publicado
    private int añoPublicacion;
    //variable que recibe el id de la editorial
    private int editorialId;

    /**
     * Constructor de la clase
     * @param id
     * @param isbn
     * @param titulo
     * @param idioma
     * @param numeroPaginas
     * @param precioReferencia
     * @param añoPublicacion
     * @param editorialId
     */
    public Libro(int id, String isbn, String titulo, String idioma, int numeroPaginas, int precioReferencia, int añoPublicacion, int editorialId) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.idioma = idioma;
        this.numeroPaginas = numeroPaginas;
        this.precioReferencia = precioReferencia;
        this.añoPublicacion = añoPublicacion;
        this.editorialId = editorialId;
    }

    public Libro(String isbn, String titulo, String idioma, int numeroPaginas, int precioReferencia, int añoPublicacion, int editorialId) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.idioma = idioma;
        this.numeroPaginas = numeroPaginas;
        this.precioReferencia = precioReferencia;
        this.añoPublicacion = añoPublicacion;
        this.editorialId = editorialId;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getPrecioReferencia() {
        return precioReferencia;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public int getEditorialId() {
        return editorialId;
    }

    /**
     * Metodo que muestra algunos atributos de la clase libro
     * @return String
     */
    @Override
    public String toString() {
        return titulo + " (" + isbn + ")";
    }
}
