/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.esquemaBD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nescob18
 * @author Yorman Aguirre
 */
public abstract class esquemaBD {
    
    public static ArrayList<String> agregarNuevasTablas(){
        ArrayList<String> arrTabla = new ArrayList<>();
        
        arrTabla.add( 
        "CREATE TABLE IF NOT EXISTS Estudiante (" +
        "Codigo BIGINT(12) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
        "Nombre VARCHAR(20)," +
        "Apellidos VARCHAR(30)," +
        "FechaNacimiento DATE)"          
        );
        
        return arrTabla;
    }
    
    public static void crearTablasBD(Connection con){
        
        try {
           ArrayList<String> arrTabla = agregarNuevasTablas();
           Statement st = con.createStatement();
           for (String tabla : arrTabla) {
                st.executeUpdate(tabla);
           }
           System.out.println("Tabla creada");
        } catch (SQLException e) {
            System.out.println("Un error ocurrio creando la tabla");
            e.printStackTrace();
        }
    }
}
