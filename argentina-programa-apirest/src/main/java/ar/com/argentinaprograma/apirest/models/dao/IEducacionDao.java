package ar.com.argentinaprograma.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import ar.com.argentinaprograma.apirest.models.entity.Educacion;


public interface IEducacionDao extends CrudRepository<Educacion, Long> {

}
