package com.jingle.shareddata.exceptions;

public class ExpiredAuthKeyException extends Exception {

	private static final long serialVersionUID = -7489733208406011453L;

	public String getMessage() {
		return "Expired auth key";
	}
}
