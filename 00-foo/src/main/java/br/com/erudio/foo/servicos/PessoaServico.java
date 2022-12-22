package br.com.erudio.foo.servicos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.foo.modelo.Pessoa;

@Service
public class PessoaServico {

	private final AtomicLong contador = new AtomicLong();
	
	public Pessoa findById(String id) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(contador.incrementAndGet());
		pessoa.setPrimeiroNome("Carlos");
		pessoa.setUltimoNome("Lamounier");
		pessoa.setGenero("Masculino");
		pessoa.setEndereco("Brasília-DF");
		
		return pessoa;
	}
	
	public List<Pessoa> findAll(){
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		for(int i=0; i<8; i++){
			Pessoa pessoa = mockPessoa(i);
			pessoas.add(pessoa);
		}
		return pessoas;
	}

	//RETORNA UMA LISTA DE PESSOAS USANDO O MOCK
	private Pessoa mockPessoa(int i) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(contador.incrementAndGet());
		pessoa.setPrimeiroNome("Primeiro Nome" + i);
		pessoa.setUltimoNome("Ultimo Nome" + i);
		pessoa.setGenero("Genero" + i);
		pessoa.setEndereco("Estado" + i);
		return pessoa;
	}
	
	
}
