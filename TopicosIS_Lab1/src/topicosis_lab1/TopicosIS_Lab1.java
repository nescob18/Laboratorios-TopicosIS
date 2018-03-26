/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topicosis_lab1;

import java.sql.Connection;
import datos.conexion.ConexionBD;
import datos.esquemaBD.esquemaBD;
import presentacion.vista.ViewEstudiante;

/**
 *
 * @author Nescob18
 * @author Yorman Aguirre
 */
public class TopicosIS_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = ConexionBD.conectar();
        esquemaBD.crearTablasBD(con);
        ViewEstudiante vista = new ViewEstudiante();
        vista.setVisible(true);
    }
}
