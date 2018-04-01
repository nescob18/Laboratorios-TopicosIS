/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.esquemaBD;

import datos.infoHostBD.infoHostBD;
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
    
    public static void crearBD(Connection con){
        
        try {
           String nuevaBD = "CREATE DATABASE IF NOT EXISTS " + infoHostBD.getNombreBD();
           Statement st = con.createStatement();
           st.executeUpdate(nuevaBD);
        } catch (SQLException e) {
            System.out.println("Un error ocurrio creando la BD");
            e.printStackTrace();
        }
    }
    
    public static void crearTablasBD(Connection con){
        
        try {
           ArrayList<String> arrTabla = agregarNuevasTablas();
           Statement st = con.createStatement();
           for (String tabla : arrTabla) {
                st.executeUpdate(tabla);
           }
        } catch (SQLException e) {
            System.out.println("Un error ocurrio creando la tabla");
            e.printStackTrace();
        }
    }
    
    
    public static ArrayList<String> agregarNuevasTablas(){
        ArrayList<String> arrTabla = new ArrayList<>();
        
        arrTabla.add( 
        "CREATE TABLE IF NOT EXISTS Estudiante (" +
        "Codigo BIGINT(12) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY," +
        "Nombre VARCHAR(20) NOT NULL," +
        "Apellidos VARCHAR(30) NOT NULL," +
        "FechaNacimiento DATE NOT NULL )"          
        );
        
        return arrTabla;
    }
}
