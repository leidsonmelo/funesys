package br.edu.estacio.pos.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="FORMA_PAGAMENTO", discriminatorType=DiscriminatorType.STRING)
public abstract class Pagamento {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	private Double valor;
	
	public abstract String imprimir();
	
	public abstract Double aplicarDesconto();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
