package br.edu.estacio.pos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Divida {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@OneToOne
	private Associado associado;

	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Fatura> faturas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Associado getAssociado() {
		return associado;
	}

	public void setAssociado(Associado associado) {
		this.associado = associado;
	}

	public List<Fatura> getFaturas() {
		if (faturas == null)
			faturas = new ArrayList<Fatura>();
		return faturas;
	}

	public void setFaturas(List<Fatura> faturas) {
		this.faturas = faturas;
	}

	public void adicionarFatura(Double valor) {
		Fatura fatura = new Fatura();
		fatura.setDivida(this);
		fatura.setValor(valor);
		getFaturas().add(fatura);
	}

}
