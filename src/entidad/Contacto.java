package entidad;
/**
 * Clase que representa el contacto(dirección, teléfono y correo electrónico) que se tiene de las personas adheridas a la empresa
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017
 * Nombre de la clase: Contacto
 */
public class Contacto {
    //variable de identificación
    private int id;
    //variable que define el tipo de contacto(dirección-email-fono)
    private String tipo;
    //variable que almacena los valores correspondientes al tipo de contacto
    private String valor;
    //variable de distinción de tipos de contacto (personal, empresa, móvil, etc)
    private String subtipo;
    //variable que recibe el id de la razón social asociada
    private int razonSocialId;

    /**
     * Constructor de la clase
     * @param id
     * @param tipo
     * @param valor
     * @param subtipo
     * @param razonSocialId 
     */
    public Contacto(int id, String tipo, String valor, String subtipo, int razonSocialId) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.subtipo = subtipo;
        this.razonSocialId = razonSocialId;
    }

    public Contacto(String tipo, String valor, String subtipo, int razonSocialId) {
        this.tipo = tipo;
        this.valor = valor;
        this.subtipo = subtipo;
        this.razonSocialId = razonSocialId;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public int getRazonSocialId() {
        return razonSocialId;
    }
}
