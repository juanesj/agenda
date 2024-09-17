package edu.galileo.Agenda.model.repository;
import edu.galileo.Agenda.model.Contacto;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContactoRepository  extends CrudRepository<Contacto, Integer >{
   
    
    List<Contacto> findAll();


}

