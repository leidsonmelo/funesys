package br.edu.estacio.pos.service;

import java.util.Date;
import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.estacio.pos.model.Boleto;
import br.edu.estacio.pos.model.Carne;
import br.edu.estacio.pos.model.Debito;
import br.edu.estacio.pos.model.Fatura;
import br.edu.estacio.pos.model.Pagamento;
import br.edu.estacio.pos.repository.DividaRepository;
import br.edu.estacio.pos.repository.FaturaRepository;

@Service
public class FaturaService implements IFaturaService {

	@Autowired
	private FaturaRepository repository;
	
	@Autowired
	private DividaRepository dividaRepository;
	
	@Override
	public List<Fatura> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public void delete(Fatura fatura) {
		repository.delete(fatura.getId());
	}

	@Override
	public void pagarDebito(Fatura fatura) {
		Double valor = fatura.getValor();
		Pagamento pagamento = new Debito(new Date(), valor);
		
		fatura.pagar(pagamento);
		
		updateFatura(fatura);
	}

	@Override
	public void pagarCarne(Fatura fatura) {
		Double valor = fatura.getValor();
		Pagamento pagamento = new Carne(valor);
		
		fatura.pagar(pagamento);
		
		updateFatura(fatura);
	}

	@Override
	public void pagarBoleto(Fatura fatura) {
		Double valor = fatura.getValor();
		Pagamento pagamento = new Boleto(valor);
		
		fatura.pagar(pagamento);
		
		updateFatura(fatura);
	}
	
	private void updateFatura(Fatura fatura){
		fatura.setDivida(dividaRepository.findOne(fatura.getDivida().getId()));
		repository.save(fatura);
	}

}
