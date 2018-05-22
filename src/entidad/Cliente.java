package entidad;
/**
 * Clase correspondiente al usuario cliente de la biblioteca. es decir, quien compra o arrienda libros a la biblioteca.
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Cliente
 */
public class Cliente {
    //variable de identificación única
    private int id;
    //variable que almacena la fecha de ancimiento del usuario
    private String fechaNacimiento;
    //variable que recibe el id de la persona asociada
    private int personaId;

    /**
     * Constructor de la clase
     * @param id
     * @param fechaNacimiento
     * @param personaId 
     */
    public Cliente(int id, String fechaNacimiento, int personaId) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.personaId = personaId;
    }

    public Cliente(String fechaNacimiento, int personaId) {
        this.fechaNacimiento = fechaNacimiento;
        this.personaId = personaId;
    }

    public int getId() {
        return id;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getPersonaId() {
        return personaId;
    }
}
