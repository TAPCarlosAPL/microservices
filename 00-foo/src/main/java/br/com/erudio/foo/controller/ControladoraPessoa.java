//INJEÇÃO DOS SERVIÇOS
package br.com.erudio.foo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.foo.modelo.Pessoa;
import br.com.erudio.foo.servicos.PessoaServico;

@RestController
@RequestMapping("/pessoa")
public class ControladoraPessoa {
	
	@Autowired
	private PessoaServico servicos;
	
	
	@RequestMapping(method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pessoa> findAll(){
		return servicos.findAll();
	}

	@RequestMapping(value="/{id}",
			method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Pessoa findById(@PathVariable("id") String id){
		return servicos.findById(id);
	}
}