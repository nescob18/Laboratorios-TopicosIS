/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.ArrayList;
import java.util.List;
 
import DAO.EstudianteDAO;
import DAO.IEstudianteDAO;
import datos.modelo.Estudiante;

/**
 *
 * @author Yorman Aguirre
 */
public class ControladorEstudiante {
    
	
    public ControladorEstudiante() {}
	
    //llama al DAO para guardar un cliente
    public boolean registrar(Estudiante estudiante) {
        IEstudianteDAO dao = new  EstudianteDAO();
        return dao.registrar(estudiante);
    }
	
    //llama al DAO para actualizar un cliente
    public boolean actualizar(Estudiante estudiante) {
	IEstudianteDAO  dao = new  EstudianteDAO();
	return dao.actualizar(estudiante);
    }
	
    //llama al DAO para eliminar un cliente
    public boolean eliminar(Estudiante estudiante) {
	IEstudianteDAO dao = new  EstudianteDAO();
	return dao.eliminar(estudiante);
    }
	
    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public List<Estudiante> verEstudiantes(){
	List<Estudiante> estudiantes = new ArrayList<Estudiante>();
	IEstudianteDAO dao = new  EstudianteDAO();
	estudiantes = dao.obtener();
	return estudiantes;
    }
    
    
}
