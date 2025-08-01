package com.foodApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class DataIntegrityViolationException extends RuntimeException {
	public DataIntegrityViolationException(String message) {
		super(message);
	}
}
	