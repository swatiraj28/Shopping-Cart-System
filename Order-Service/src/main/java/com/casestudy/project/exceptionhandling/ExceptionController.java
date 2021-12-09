package com.casestudy.project.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //global exception handler (Exception controller class)
public class ExceptionController {
	
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> handleEmptyInput(OrderNotFoundException orderNotFoundException){
		return new ResponseEntity<String>(orderNotFoundException.getErrorMessage(), null, HttpStatus.BAD_REQUEST);
	
	
	

}
}
