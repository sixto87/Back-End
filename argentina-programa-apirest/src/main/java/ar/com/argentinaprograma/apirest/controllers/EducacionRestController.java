package ar.com.argentinaprograma.apirest.controllers;

import java.util.List;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ar.com.argentinaprograma.apirest.models.entity.Educacion;

import ar.com.argentinaprograma.apirest.models.services.IEducacionService;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class EducacionRestController {
	
	@Autowired
	private IEducacionService educacionService;
	
	@GetMapping("/educacion")
	public List<Educacion> index(){
		return educacionService.findAll();
	}
	
	@GetMapping("/educacion/{id}")
	public Educacion show(@PathVariable Long id){
	return educacionService.findById(id);	
	}
	
	@PostMapping("/educacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Educacion create(@RequestBody Educacion educacion) {
		return educacionService.save(educacion);
	}
	
	@PutMapping("/educacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Educacion update(@RequestBody Educacion Educacion, @PathVariable Long id) {
		Educacion educacionActual = educacionService.findById(id);
		
		
		educacionActual.setNombre(Educacion.getNombre());
		educacionActual.setFecha(Educacion.getFecha());
		educacionActual.setDescripcion(Educacion.getDescripcion());
		educacionActual.setPlataforma(Educacion.getPlataforma());
		educacionActual.setDocente(Educacion.getDocente());
		
		return educacionService.save(educacionActual);
	}
	
	@DeleteMapping("/educacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		educacionService.delete(id);
	}
	
	
	
}