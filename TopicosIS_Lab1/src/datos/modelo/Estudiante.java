/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.modelo;

import java.util.Date;
/**
 *
 * @author Yorman Aguirre
 */
public class Estudiante {
        private long codigo;
	
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	
        /**
         * Método constructor
         */
	public Estudiante() {}
	
	public Estudiante(String nombre, String apellidos, String fechaNacimiento) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNacimiento = fechaNacimiento;
	}
 
	public long getCodigo() {
            return codigo;
	}
 
	public void setCodigo(long codigo) {
            this.codigo = codigo;
	}
 
	public String getNombre() {
            return nombre;
	}
 
	public void setNombre(String nombre) {
            this.nombre = nombre;
	}
 
	public String getApellidos() {
            return apellidos;
	}
 
	public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
	}
 
	public String getFechaNacimiento() {
            return fechaNacimiento;
	}
 
	public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
            return this.codigo+", "+this.nombre+", "+this.apellidos+", "+this.fechaNacimiento;
	}
}
