package br.edu.infnet.votagrl.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.votagrl.model.domain.Voto;

@Repository
public interface VotoRepository extends CrudRepository<Voto, Integer>{

}
