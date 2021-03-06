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
import ar.com.argentinaprograma.apirest.models.entity.Skill;
import ar.com.argentinaprograma.apirest.models.services.ISkillService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class SkillRestController {
	
	@Autowired
	private ISkillService skillService;
	
	@GetMapping("/skill")
	public List<Skill> index(){
		return skillService.findAll();
	}
	
	@GetMapping("/skill/{id}")
	public Skill show(@PathVariable Long id){
	return skillService.findById(id);	
	}
	
	@PostMapping("/skill")
	@ResponseStatus(HttpStatus.CREATED)
	public Skill create(@RequestBody Skill skill) {
		return skillService.save(skill);
	}
	
	@PutMapping("/skill/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Skill update(@RequestBody Skill Skill, @PathVariable Long id) {
		Skill skillActual = skillService.findById(id);
		
		
		skillActual.setNombre(Skill.getNombre());
		skillActual.setPorcentaje(Skill.getPorcentaje());
		
		
		return skillService.save(skillActual);
	}
	
	@DeleteMapping("/skill/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		skillService.delete(id);
	}
	
	
	
}