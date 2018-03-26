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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public abstract class ConexionBD {
    
	public static Connection conectar() {
            Connection con = null;
                
            final String bD = "mysql";
            final String hostBD = "sql9.freemysqlhosting.net";
            final String puerto = "3306";
            final String nombreBD = "sql9227841";
            final String url = "jdbc:" + bD + "://" + hostBD + ":" + puerto + "/" + nombreBD;
                
            final String usuario = "sql9227841";
            final String password = "6LriqwsrsY";

            try {
                con = DriverManager.getConnection(url,usuario,password);
                if (con != null) {
                    System.out.println("Conectado");
                }
            } catch (SQLException e) {
                System.out.println("No se pudo conectar a la base de datos");
                e.printStackTrace();
            }
            return con;
	}
}
