
package proyecto_final0.pkg0;

import java.sql.SQLException;
import vista.Vista;

public class Proyecto_Final0 {
    
//*Proyecto_Final20:Esta parte se encarga de permitir que la interfaz grafica sea visible para el usuario.
    
    public static void main(String[] args) throws SQLException {
        Vista vi = new Vista ();
        vi.setVisible(true);
        vi.setLocationRelativeTo(null);
        

    }
    
}
