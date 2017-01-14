package br.edu.estacio.pos.service;

import java.util.List;

import br.edu.estacio.pos.model.Fatura;

public interface IFaturaService {

	List<Fatura> findAll();

	void delete(Fatura fatura);

	void pagarDebito(Fatura fatura);

	void pagarCarne(Fatura fatura);

	void pagarBoleto(Fatura fatura);
	
}
