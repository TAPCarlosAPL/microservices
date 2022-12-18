package br.com.erudio.foo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.foo.exception.OperacaoMathInvalida;
import br.com.erudio.foo.matematica.MatSimples;
import br.com.erudio.foo.request.conversao.ConversaoNumero;

@RestController
public class ControladoraPessoa {

	private MatSimples mat = new MatSimples();
	
	
	@RequestMapping(value="/soma/{numOne}/{numTwo}", method=RequestMethod.GET)
	public Double soma(@PathVariable("numOne") String numOne, @PathVariable("numTwo") String numTwo) throws Exception{
		if(!ConversaoNumero.isNumeric(numOne) || !ConversaoNumero.isNumeric(numTwo)){
			throw new OperacaoMathInvalida("Defina um valor numérico! lol");
		}
		return mat.soma(ConversaoNumero.convertToDuble(numOne), ConversaoNumero.convertToDuble(numTwo));//SOMA

	}
	
	@RequestMapping(value="/sub/{numOne}/{numTwo}", method=RequestMethod.GET)
	public Double sub(@PathVariable("numOne") String numOne, @PathVariable("numTwo") String numTwo) throws Exception{
		if(!ConversaoNumero.isNumeric(numOne) || !ConversaoNumero.isNumeric(numTwo)){
			throw new OperacaoMathInvalida("Defina um valor numérico! lol");
		}
		return mat.subtracao(ConversaoNumero.convertToDuble(numOne), ConversaoNumero.convertToDuble(numTwo));//SUBTRAÇÃO
	}
	
	@RequestMapping(value="/mult/{numOne}/{numTwo}", method=RequestMethod.GET)
	public Double mult(@PathVariable("numOne") String numOne, @PathVariable("numTwo") String numTwo) throws Exception{
		if(!ConversaoNumero.isNumeric(numOne) || !ConversaoNumero.isNumeric(numTwo)){
			throw new OperacaoMathInvalida("Defina um valor numérico! lol");
		}
		return mat.multiplicacao(ConversaoNumero.convertToDuble(numOne), ConversaoNumero.convertToDuble(numTwo));//MULTIPLICAÇÃ
	}
	
	@RequestMapping(value="/divis/{numOne}/{numTwo}", method=RequestMethod.GET)
	public Double divis(@PathVariable("numOne") String numOne, @PathVariable("numTwo") String numTwo) throws Exception{
		if(!ConversaoNumero.isNumeric(numOne) || !ConversaoNumero.isNumeric(numTwo)){
			throw new OperacaoMathInvalida("Defina um valor numérico! lol");
		}
		return mat.divisao(ConversaoNumero.convertToDuble(numOne), ConversaoNumero.convertToDuble(numTwo));//DIVISÃO
	}
	
	@RequestMapping(value="/media/{numOne}/{numTwo}", method=RequestMethod.GET)
	public Double media(@PathVariable("numOne") String numOne, @PathVariable("numTwo") String numTwo) throws Exception{
		if(!ConversaoNumero.isNumeric(numOne) || !ConversaoNumero.isNumeric(numTwo)){
			throw new OperacaoMathInvalida("Defina um valor numérico! lol");
		}
		return mat.media(ConversaoNumero.convertToDuble(numOne), ConversaoNumero.convertToDuble(numTwo));//MEDIA
	}
	
	@RequestMapping(value="/raiz/{numOne}", method=RequestMethod.GET)
	public Double raiz(@PathVariable("numOne") String numOne) throws Exception{
		if(!ConversaoNumero.isNumeric(numOne)){
			throw new OperacaoMathInvalida("Defina um valor numérico! lol");
		}
		return mat.raiz(ConversaoNumero.convertToDuble(numOne));//raiz
	}
} 


//CÓDIGOS SECUNDÁRIOS//

//Primeira solução
//IMPLEMENTAR EXCEÇÃO DE ERRO NA FUNCTION DA RAIZ QUADRADA
//	@RequestMapping(value="/raiz/{numOne}", method=RequestMethod.GET)
//	public Double raiz(@PathVariable("numOne") double numOne){
//		Double raiz = Math.sqrt(numOne);
//		return raiz; //RAIZ QUADRADA
//	}