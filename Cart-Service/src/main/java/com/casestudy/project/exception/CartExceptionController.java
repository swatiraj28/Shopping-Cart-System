package com.casestudy.project.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.casestudy.project.exception.ItemException;

@ControllerAdvice
public class CartExceptionController {

	@ExceptionHandler(ItemException.class)
	public ResponseEntity<String> handelEmptyInput(ItemException itemException){
		return new ResponseEntity<String>(itemException.getErrorMessage(), null, HttpStatus.BAD_REQUEST );
	}
}
