package ar.com.argentinaprograma.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="educacion")
public class Educacion implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String fecha;
	private String descripcion;
	private String plataforma;
	private String docente;
	
	
	
	
	public String getPlataforma() {
		return plataforma;
	}





	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}





	public String getDocente() {
		return docente;
	}





	public void setDocente(String docente) {
		this.docente = docente;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getFecha() {
		return fecha;
	}





	public void setFecha(String fecha) {
		this.fecha = fecha;
	}





	public String getDescripcion() {
		return descripcion;
	}





	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}


