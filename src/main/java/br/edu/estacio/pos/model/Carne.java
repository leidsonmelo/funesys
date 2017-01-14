package br.edu.estacio.pos.model;

import javax.persistence.Entity;

@Entity
public class Carne extends Pagamento {

	@Override
	public String imprimir() {
		return "PAGAMENTO EM CARNÊ";
	}

	@Override
	public Double aplicarDesconto() {
		return getValor();
	}

}
