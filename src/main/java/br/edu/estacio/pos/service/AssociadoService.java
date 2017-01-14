package br.edu.estacio.pos.service;

import java.util.List;

import javax.transaction.Transactional;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.estacio.pos.model.Associado;
import br.edu.estacio.pos.repository.AssociadoRepository;

@Service
public class AssociadoService implements IAssociadoService {

	@Autowired
	private AssociadoRepository repository;
	
	@Autowired
	private IDividaService dividaService;
	
	@Override
	@Transactional
	public Associado save(Associado associado) {
		associado = repository.save(associado);
		dividaService.startDebit(associado);
		return associado;
	}

	@Override
	public Associado findOne(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public List<Associado> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public void delete(Associado associado) {
		repository.delete(associado.getId());
	}

}
