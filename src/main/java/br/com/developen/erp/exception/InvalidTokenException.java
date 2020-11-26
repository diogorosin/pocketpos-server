package br.com.developen.erp.exception;

import br.com.developen.erp.util.I18N;

public class InvalidTokenException extends UnauthorizedException{

	private static final long serialVersionUID = 1L;

	public InvalidTokenException(){

		super(I18N.get(I18N.INVALID_TOKEN));

	}

}