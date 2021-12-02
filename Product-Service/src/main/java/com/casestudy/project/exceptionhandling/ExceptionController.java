package com.casestudy.project.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //global exception handler (Exception controller class)
public class ExceptionController {
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException){
		return new  ResponseEntity<String> ("Product not Found !! Check Again",HttpStatus.BAD_REQUEST);
		//response entity only take 2 parameter
	
	

}
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception){
        return new ResponseEntity<>("Product not Found !! Check Again", HttpStatus.NOT_FOUND);
}
}
