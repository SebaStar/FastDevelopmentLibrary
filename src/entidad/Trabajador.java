package entidad;
/**
 * Clase que representa a una persona real que trabaja para la biblioteca
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Trabajador
 */
public class Trabajador {
    //variable identificadora
    private int id;
    //variable que almacena la fecha en la que se contrató al trabajador
    private String fechaContrato;
    //variable que recibe el id de la persona asociada
    private int personaId;

    /**
     * Constructor de la clase
     * @param id
     * @param fechaContrato
     * @param personaId 
     */
    public Trabajador(int id, String fechaContrato, int personaId) {
        this.id = id;
        this.fechaContrato = fechaContrato;
        this.personaId = personaId;
    }

    public Trabajador(String fechaContrato, int personaId) {
        this.fechaContrato = fechaContrato;
        this.personaId = personaId;
    }

    public int getId() {
        return id;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public int getPersonaId() {
        return personaId;
    }
}
