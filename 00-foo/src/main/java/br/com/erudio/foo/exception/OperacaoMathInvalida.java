package br.com.erudio.foo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OperacaoMathInvalida extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public OperacaoMathInvalida(String exception) {
		super(exception);
	}
}
