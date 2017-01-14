package br.edu.estacio.pos.service;

import java.util.List;

import br.edu.estacio.pos.model.Plano;

public interface IPlanoService {

	List<Plano> findAll();

	Plano save(Plano plano);
	
	void delete(Plano plano);

}
