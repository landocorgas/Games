package com.leandro.jogos.resource.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.leandro.jogos.service.exceptions.DataIntegrityException;
import com.leandro.jogos.service.exceptions.ObjetoNaoEncontradoException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjetoNaoEncontradoException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjetoNaoEncontradoException e, HttpServletRequest request){
		
		StandardError erro = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(DataIntegrityException.class)
	public ResponseEntity<StandardError> objectNotFound(DataIntegrityException e, HttpServletRequest request){
		
		StandardError erro = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}
}
