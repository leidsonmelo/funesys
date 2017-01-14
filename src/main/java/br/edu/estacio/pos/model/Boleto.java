package br.edu.estacio.pos.model;

import javax.persistence.Entity;

@Entity
public class Boleto extends Pagamento {

	@Override
	public String imprimir() {
		return "PAGAMENTO EM BOLETO";
	}

	@Override
	public Double aplicarDesconto() {
		return getValor() + (getValor() * 5/100);
	}

}
