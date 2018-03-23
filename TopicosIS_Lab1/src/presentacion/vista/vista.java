/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vista;

import java.util.ArrayList;
import negocio.Estudiante;

/**
 *
 * @author Nescob18
 */
public abstract class vista {
    
    public static void verTodosEstudiantes(ArrayList<Estudiante> estudiantes){
        for (Estudiante estudiante : estudiantes) {
            //System.out.println("Datos del : "+ estudiante);
        }	
    }
    
    public static void verEstudiante(Estudiante estudiante){
        
    }
}
