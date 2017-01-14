package br.edu.estacio.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.estacio.pos.model.Account;
import br.edu.estacio.pos.service.ILoginService;

@RestController
public class LoginController {

	@Autowired
	private ILoginService service;
	
	@RequestMapping( value="singup", method=RequestMethod.POST)
	public ResponseEntity<Account> singup(@RequestBody Account account){
		account = service.singup(account);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}
	
	@RequestMapping( value="login", method=RequestMethod.POST)
	public ResponseEntity<Account> login(@RequestBody Account account){
		account = service.login(account);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}
	
}
