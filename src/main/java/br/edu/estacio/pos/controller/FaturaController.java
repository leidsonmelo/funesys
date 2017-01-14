package br.edu.estacio.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.estacio.pos.model.Fatura;
import br.edu.estacio.pos.service.IFaturaService;

@RestController
@RequestMapping("/api/fatura")
public class FaturaController {

	@Autowired
	private IFaturaService service;
	
	@RequestMapping(value="findall", method=RequestMethod.GET)
	public ResponseEntity<List<Fatura>> findAll(){
		List<Fatura> faturas = service.findAll();
		for(Fatura fatura : faturas){
			fatura.getDivida().setFaturas(null);
		}
		return new ResponseEntity<List<Fatura>>(faturas, HttpStatus.OK);
	}
	
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public ResponseEntity<Fatura> delete(@RequestBody Fatura fatura){
		service.delete(fatura);
		return new ResponseEntity<Fatura>(HttpStatus.OK);		
	}
	
}
