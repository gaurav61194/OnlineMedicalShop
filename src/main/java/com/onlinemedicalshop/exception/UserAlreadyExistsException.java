package com.onlinemedicalshop.exception;

public class UserAlreadyExistsException extends Exception {

	/**
	 * SerialVersionVID 
	 */
	private static final long serialVersionUID = 1L;

	 public UserAlreadyExistsException(String string) {
		 super(string);
	 }
}
