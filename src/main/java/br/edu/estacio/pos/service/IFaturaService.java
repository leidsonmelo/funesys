package br.edu.estacio.pos.service;

import java.util.List;

import br.edu.estacio.pos.model.Fatura;

public interface IFaturaService {

	List<Fatura> findAll();

	void delete(Fatura fatura);
	
}
