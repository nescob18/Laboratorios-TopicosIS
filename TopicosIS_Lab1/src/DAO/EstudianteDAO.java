/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import datos.conexion.ConexionBD;
import datos.modelo.Estudiante;
/**
 *
 * @author Yorman Aguirre
 */
public class EstudianteDAO implements IEstudianteDAO{
    
    @Override
    public boolean registrar(Estudiante estudiante) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;	
    
        String values = "\"" + estudiante.getNombre() + "\",\"" + estudiante.getApellidos() +"\",'" + estudiante.getFechaNacimiento() +"'";
        String sql = "INSERT INTO `Estudiante`(`Nombre`, `Apellidos`, `FechaNacimiento`) VALUES (" + values + ")";
        try {			
            con =ConexionBD.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
	} catch (SQLException e) {
            System.out.println("Error: Clase EstudianteDAO, método registrar");
            e.printStackTrace();
	}
	return registrar;
    }
    
    @Override
    public List<Estudiante> obtener() {
	Connection co = null;
	Statement stm = null;
	ResultSet res = null;
		
	String sql = "SELECT * FROM Estudiante ORDER BY Codigo";
		
	List<Estudiante> listaEstudiante= new ArrayList<Estudiante>();
		
	try {			
            co = ConexionBD.conectar();
            stm = co.createStatement();
            res = stm.executeQuery(sql);
            while (res.next()) {
		Estudiante estudiante = new Estudiante();
		estudiante.setCodigo(res.getLong(1));
		estudiante.setNombre(res.getString(2));
		estudiante.setApellidos(res.getString(3));
		estudiante.setFechaNacimiento(res.getString(4));
    		listaEstudiante.add(estudiante);
            }
            stm.close();
            res.close();
            co.close();
	} catch (SQLException e) {
            System.out.println("Error: Clase EstudianteDAO, método obtener");
            e.printStackTrace();
        }
		
        return listaEstudiante;
    }
    
    @Override
    public boolean actualizar(Estudiante estudiante) {
        Connection connect = null;
        Statement stm = null;
	boolean actualizar = false;	
        String sql = "UPDATE Estudiante SET Nombre='"+estudiante.getNombre()+"', Apellidos='"+estudiante.getApellidos()+"', FechaNacimiento='"+estudiante.getFechaNacimiento()+"'" +" WHERE Codigo="+estudiante.getCodigo();
	try {
            connect = ConexionBD.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
	} catch (SQLException e) {
            System.out.println("Error: Clase EstudianteDAO, método actualizar");
            e.printStackTrace();
	}		
	return actualizar;
    }
    
    @Override
    public boolean eliminar(Estudiante estudiante) {
        Connection connect = null;
	Statement stm = null;
		
	boolean eliminar = false;
				
	String sql = "DELETE FROM Estudiante WHERE Codigo="+estudiante.getCodigo();
	try {
            connect = ConexionBD.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
	} catch (SQLException e) {
            System.out.println("Error: Clase EstudianteDAO, método eliminar");
            e.printStackTrace();
	}		
        return eliminar;
    }
}
