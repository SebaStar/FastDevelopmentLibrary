package dao;

import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 * Esta clase es la encargada de acceder a los datos. Contiene los mantenedores
 * de las tablas asociadas al sistema. Propaga los errores para ser mostrados
 * ante el usuario mediante la interfaz gráfica correspondiente. Usa la Clase
 * Conexion para acceder a la base de datos, también todas las clases de entidad
 * para el mantenimiento del sistema.
 *
 * @author Paulina Delgado
 * Fecha creación: 19 de Junio, 2018
 * Nombre de la clase: BibliotecaDAO
 */
public class BibliotecaDAO {

    //establece la conexión con la Base de datos
    private Conexion conexion = new Conexion();
    
    // new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha"))
    
}
