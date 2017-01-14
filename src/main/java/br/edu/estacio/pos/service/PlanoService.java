package br.edu.estacio.pos.service;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.estacio.pos.model.Plano;
import br.edu.estacio.pos.repository.PlanoRepository;

@Service
public class PlanoService implements IPlanoService {

	@Autowired
	private PlanoRepository repository;
	
	@Override
	public List<Plano> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Plano save(Plano plano) {
		return repository.save(plano);
	}

	@Override
	public void delete(Plano plano) {
		repository.delete(plano.getId());
	}

}
