package ar.com.argentinaprograma.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table (name="skills")
public class Skill implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
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




	public Long getPorcentaje() {
		return porcentaje;
	}




	public void setPorcentaje(Long porcentaje) {
		this.porcentaje = porcentaje;
	}




	private Long porcentaje;

	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
