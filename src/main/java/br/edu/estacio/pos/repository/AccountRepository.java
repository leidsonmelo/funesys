package br.edu.estacio.pos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.estacio.pos.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

	public Account findByUsername(String username);
	
}
