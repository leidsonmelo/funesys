package br.edu.estacio.pos.model;

import javax.persistence.Entity;

@Entity
public class Boleto extends Pagamento {

	public Boleto(){
		
	}
	
	public Boleto(Double valor){
		this.setValor(valor);
	}
	
	@Override
	public String imprimir() {
		return "PAGAMENTO EM BOLETO";
	}

	@Override
	public Double aplicarDesconto() {
		return getValor() + (getValor() * 5/100);
	}

}
