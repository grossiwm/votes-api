package br.edu.infnet.votaapp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.votaapp.model.domain.Eleitor;

@Repository
public interface EleitorRepository extends CrudRepository<Eleitor, Integer>{ 

}
