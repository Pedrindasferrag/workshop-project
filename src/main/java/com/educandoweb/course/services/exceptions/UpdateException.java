package com.educandoweb.course.services.exceptions;

public class UpdateException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UpdateException(String msg) {
		super(msg);
	}

}
