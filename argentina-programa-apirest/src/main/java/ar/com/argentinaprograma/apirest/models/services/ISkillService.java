package ar.com.argentinaprograma.apirest.models.services;

import java.util.List;

import ar.com.argentinaprograma.apirest.models.entity.Skill;

public interface ISkillService {
	
	public List<Skill> findAll(); 
	
	public Skill findById(Long id);
	
	public Skill save(Skill skill);
	
	public void delete (Long id);
}
