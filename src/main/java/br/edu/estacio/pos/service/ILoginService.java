package br.edu.estacio.pos.service;

import br.edu.estacio.pos.model.Account;

public interface ILoginService {

	public Account login(Account account);
	public Account singup(Account account);
	
}
