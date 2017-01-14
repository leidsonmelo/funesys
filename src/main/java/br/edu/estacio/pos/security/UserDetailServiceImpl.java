package br.edu.estacio.pos.security;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.estacio.pos.model.Account;
import br.edu.estacio.pos.repository.AccountRepository;

public class UserDetailServiceImpl implements UserDetailsService {

	private AccountRepository accountRepository;
	
	public UserDetailServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Account account = accountRepository.findByUsername(username);
		
		if (account != null) {
			List<GrantedAuthority> permission = AuthorityUtils.createAuthorityList("USER"); 
			return new User(account.getUsername(),
					account.getPassword(), true, true, true, true, permission);
		} else {
			throw new UsernameNotFoundException(String.format("Could not find the user %s", username));
		}
	}
	
}
