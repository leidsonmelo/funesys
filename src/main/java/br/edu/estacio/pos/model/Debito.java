package br.edu.estacio.pos.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Debito extends Pagamento {

	private Date dataAgendamento;

	public Debito(){
		
	}
	
	public Debito(Date dataAgendamento, Double valor){
		this.setDataAgendamento(dataAgendamento);
		this.setValor(valor);
	}
	
	@Override
	public String imprimir() {
		return "PAGAMENTO EM DÉBITO";
	}

	@Override
	public Double aplicarDesconto() {
		return getValor() + (getValor() * 10/100);
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
}
