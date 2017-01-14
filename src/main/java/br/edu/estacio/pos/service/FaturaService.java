package br.edu.estacio.pos.service;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.estacio.pos.model.Fatura;
import br.edu.estacio.pos.repository.FaturaRepository;

@Service
public class FaturaService implements IFaturaService {

	@Autowired
	private FaturaRepository repository;
	
	@Override
	public List<Fatura> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public void delete(Fatura fatura) {
		repository.delete(fatura.getId());
	}

}
