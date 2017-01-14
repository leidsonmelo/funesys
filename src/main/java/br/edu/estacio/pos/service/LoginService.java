package br.edu.estacio.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.estacio.pos.model.Account;
import br.edu.estacio.pos.repository.AccountRepository;

@Service
public class LoginService implements ILoginService {

	@Autowired
	private AccountRepository repository;
	
	@Override
	public Account login(Account account) {
		Account count = repository.findByUsername(account.getUsername());
		if(count != null){
			if(count.getPassword().equals(account.getPassword())){
				return count;
			}
		}
		return null;
	}

	@Override
	public Account singup(Account account) {
		Account ac = repository.findByUsername(account.getUsername());
		if(ac == null){
			account = repository.save(account);
			return account;
		}
		return null;
	}
	
}
