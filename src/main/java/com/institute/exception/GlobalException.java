package com.institute.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(IDNotFoundException.class)
	public ResponseEntity<Object> idNotFoundHandler(IDNotFoundException e)
	{
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> NameNotFoundHandler(NameNotFoundException e)
	{
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(IllegalNumberOfStudentsException.class)
	public ResponseEntity<Object> IllegalNumberOfStudentsHandler(IllegalNumberOfStudentsException e)
	{
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
