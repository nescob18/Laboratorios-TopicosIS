/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topicosis_lab1;

import java.sql.Connection;
import datos.conexion.Conexion;
import datos.esquemaBD.esquemaBD;
import presentacion.vista.ListadoEstudiantes;

/**
 *
 * @author Nescob18
 * @author Yorman Aguirre
 */
public class TopicosIS_Lab1 {

    
    public static void modelarBD(){
        Connection con = Conexion.conectarHost();
        esquemaBD.crearBD(con);
        
        con = Conexion.conectarBD();
        esquemaBD.crearTablasBD(con);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelarBD();
        ListadoEstudiantes vista = new ListadoEstudiantes();
        vista.setVisible(true);
    }
}
