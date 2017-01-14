package br.edu.estacio.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.estacio.pos.model.Associado;
import br.edu.estacio.pos.model.Divida;
import br.edu.estacio.pos.repository.DividaRepository;

@Service
public class DividaService implements IDividaService {

	@Autowired
	private DividaRepository repository;
	
	@Override
	public void startDebit(Associado associado) {
		Divida divida = new Divida();
		divida.setAssociado(associado);
		divida.adicionarFatura(100.0);
		divida.adicionarFatura(350.0);
		repository.save(divida);
	}
	
}
