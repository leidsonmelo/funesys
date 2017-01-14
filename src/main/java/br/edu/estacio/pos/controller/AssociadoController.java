package br.edu.estacio.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.estacio.pos.model.Associado;
import br.edu.estacio.pos.service.IAssociadoService;

@RestController
@RequestMapping("/api/associado")
public class AssociadoController {

	@Autowired
	private IAssociadoService service;
	
	@RequestMapping(value="findall", method=RequestMethod.GET)
	public ResponseEntity<List<Associado>> findAll(){
		List<Associado> associados = service.findAll();
		return new ResponseEntity<List<Associado>>(associados, HttpStatus.OK);
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public ResponseEntity<Associado> save(@RequestBody Associado associado){
		associado = service.save(associado);
		return new ResponseEntity<Associado>(associado, HttpStatus.OK);		
	}
	
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public ResponseEntity<Associado> delete(@RequestBody Associado associado){
		service.delete(associado);
		return new ResponseEntity<Associado>(HttpStatus.OK);		
	}
	
}
