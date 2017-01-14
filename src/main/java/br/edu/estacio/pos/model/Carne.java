package br.edu.estacio.pos.model;

import javax.persistence.Entity;

@Entity
public class Carne extends Pagamento {

	public Carne(){
		
	}
	
	public Carne(Double valor){
		this.setValor(valor);
	}
	
	@Override
	public String imprimir() {
		return "PAGAMENTO EM CARNÊ";
	}

	@Override
	public Double aplicarDesconto() {
		return getValor();
	}

}
