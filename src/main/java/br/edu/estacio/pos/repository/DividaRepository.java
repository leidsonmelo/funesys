package br.edu.estacio.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.estacio.pos.model.Divida;

@Repository
public interface DividaRepository extends CrudRepository<Divida, Integer>{

}
