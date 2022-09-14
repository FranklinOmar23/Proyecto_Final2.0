
package ConexionSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiosqlite {
    Connection Conexion;
    
//*ConexionSQLite:Esta se encarga de conectar el programa como tal con la Base de Datos.
    
    public Connection Conectar() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            Conexion = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\DB Browser for SQLite\\DB_Final\\DB_proyectofinal.db");
            System.out.println("Conexion Con exito");

        } catch (ClassNotFoundException | SQLException sqlex) {
            System.out.println("No se pudo Conectar la Base de Datos " + sqlex);

        }

        return Conexion;
    }

    
}
