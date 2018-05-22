package dao;

import java.sql.*;
/**
 * Genera la conexión con la base de datos.
 * Sin esta clase no se puede acceder a la base de datos, por consiguente tampoco se puede acceder a los datos.
 * Esta clase es usada por la clase BIBLIOTECADAO
 * 
 * @author Sebastian Cabellos, Nathalia Cerda
 * Fecha creación: 27 de Junio,2017  
 * Nombre de la clase: Conexion
 */
public class Conexion {

    private final String db = "biblioteca";
    private final String url = "jdbc:mysql://localhost:3306/" + db;
    private final String user = "root";
    private final String pass = "";
    private Connection con;
    private Statement st;

    public Conexion() {
        con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }

    public ResultSet query(String SQL) {
        try {
            st = con.createStatement();
            return st.executeQuery(SQL);
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean insertQuery(String SQL) {
        try {
            int r = st.executeUpdate(SQL);
            return r == 1;
        } catch (SQLException ex) {
            return false;
        }
    }
}
