package br.edu.infnet.votaapp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.votaapp.model.domain.Voto;

@Repository
public interface VotoRepository extends CrudRepository<Voto, Integer>{

}
