package br.edu.estacio.pos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.estacio.pos.model.Account;
import br.edu.estacio.pos.repository.AccountRepository;

@SpringBootApplication
public class FunesysApplication implements CommandLineRunner {

	@Autowired
	private AccountRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(FunesysApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		repository.save(new Account("admin", "admin"));
	}	
	
}
