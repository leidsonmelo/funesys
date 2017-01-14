package br.edu.estacio.pos.service;

import java.util.List;

import br.edu.estacio.pos.model.Associado;

public interface IAssociadoService {

	public Associado save(Associado associado);
	
	public Associado findOne(Integer id);
	
	public List<Associado> findAll();
	
	public void delete(Associado associado);
	
}
