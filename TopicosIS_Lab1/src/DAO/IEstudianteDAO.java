/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import datos.modelo.Estudiante;

/**
 *
 * @author Yorman Aguirre
 */
public interface IEstudianteDAO {
    public boolean registrar(Estudiante estudiante);
    public List<Estudiante> obtener();
    public boolean actualizar(Estudiante cliente);
    public boolean eliminar(Estudiante cliente);
}
