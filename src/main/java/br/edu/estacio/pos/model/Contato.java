package br.edu.estacio.pos.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contato {

	private String telefone;
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
