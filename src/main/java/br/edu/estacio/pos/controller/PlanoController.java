package br.edu.estacio.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.estacio.pos.model.Plano;
import br.edu.estacio.pos.service.IPlanoService;

@RestController
@RequestMapping("/api/plano")
public class PlanoController {

	@Autowired
	private IPlanoService service;
	
	@RequestMapping(value="findall", method=RequestMethod.GET)
	public ResponseEntity<List<Plano>> findAll(){
		List<Plano> planos = service.findAll();
		return new ResponseEntity<List<Plano>>(planos, HttpStatus.OK);
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public ResponseEntity<Plano> save(@RequestBody Plano plano){
		plano = service.save(plano);
		return new ResponseEntity<Plano>(plano, HttpStatus.OK);		
	}
	
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public ResponseEntity<Plano> delete(@RequestBody Plano plano){
		service.delete(plano);
		return new ResponseEntity<Plano>(HttpStatus.OK);		
	}
	
}
