package br.com.erudio.foo.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.erudio.foo.exception.ExceptionResponse;
import br.com.erudio.foo.exception.OperacaoMathInvalida;

@ControllerAdvice 
@RestControllerAdvice

public class CostumizacaoResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception e, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), e.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
		@ExceptionHandler(OperacaoMathInvalida.class)
		public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception e, WebRequest request){
			ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), e.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
		}
}