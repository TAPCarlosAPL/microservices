package br.com.erudio.foo.matematica;

public class MatSimples {

	public Double soma(Double numOne, Double numTwo){
		return numOne + numTwo;
	}
	
	public Double multiplicacao(Double numOne, Double numTwo){
		return numOne * numTwo;
	}
	
	public Double subtracao(Double numOne, Double numTwo){
		return numOne - numTwo;
	}
	
	public Double divisao(Double numOne, Double numTwo){
		return numOne / numTwo;
	}
	
	public Double media (Double numOne, Double numTwo){
		return numOne + numTwo / 2;
	}
	
	public Double raiz(Double numOne){
		return (Double) Math.sqrt(numOne);
	}
}
