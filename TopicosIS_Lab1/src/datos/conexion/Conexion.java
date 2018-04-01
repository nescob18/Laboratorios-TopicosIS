/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.conexion;

/**
 *
 * @author Nescob18
 */
import datos.infoHostBD.infoHostBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public abstract class Conexion {
    
	public static Connection conectarHost() {
            return conectar("");
	}
        
        public static Connection conectarBD() {
            return conectar(infoHostBD.getNombreBD());
	}
        
        public static Connection conectar(String nombreBD) {
            Connection con = null;
                
            final String bD = infoHostBD.getbD();
            final String host = infoHostBD.getHost();
            final String puerto = infoHostBD.getPuerto();
            
            final String url = "jdbc:" + bD + "://" + host + ":" + puerto + "/" + nombreBD;
                
            final String usuario = infoHostBD.getUsuario();
            final String password = infoHostBD.getPassword();

            try {
                con = DriverManager.getConnection(url,usuario,password);
            } catch (SQLException e) {
                System.out.println("No se pudo conectar a la base de datos");
                e.printStackTrace();
            }
            return con;
	}
}
