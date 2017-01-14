package br.edu.estacio.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.estacio.pos.model.Fatura;

@Repository
public interface FaturaRepository extends CrudRepository<Fatura, Integer>{

}
