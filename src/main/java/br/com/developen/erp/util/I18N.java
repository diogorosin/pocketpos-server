package br.com.developen.erp.util;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18N {

	public static final String INTERNAL_SERVER_ERROR = "internalServerError";
	public static final String MALFOMED_AUTHENTICATION_TOKEN_ERROR = "malformedAuthenticationToken";
	public static final String INVALID_DEVICE_CREDENTIALS_ERROR = "invalidDeviceCredentials";
	public static final String CONFLICT_ERROR = "conflictError";
	public static final String NOT_FOUND_ERROR = "notFoundError";
	public static final String RESOURCE_NOT_ALLOWED = "resourceNotAllowed";
	public static final String HTTP_AUTHORIZATION_HEADER_NOT_FOUND = "httpAuthorizationHeaderNotFound";
	public static final String REQUESTED_RANGE_NOT_SATISFIABLE = "requestedRangeNotSatisfiable";
	public static final String DEVICE_NOT_FOUND = "deviceNotFound";
	public static final String DEVICE_NOT_ACTIVE = "deviceNotActive";
	public static final String USER_ALREADY_LOGGED_INTO_COMPANY = "userAlreadyLoggedIntoCompany";
	public static final String USER_NOT_LINKED_TO_THE_COMPANY = "userNotLinkedToTheCompany";
	public static final String DEVICE_NOT_LINKED_TO_THE_COMPANY = "deviceNotLinkedToTheCompany";
	public static final String DEVICE_NOT_ALLOWED_ON_THIS_COMPANY = "deviceNotAllowedOnThisCompany";
	public static final String USER_NOT_FOUND = "userNotFound";
	public static final String USER_NOT_ACTIVE = "userNotActive";
	public static final String USER_NOT_ALLOWED = "userNotAllowed";
	public static final String COMPANY_NOT_FOUND = "companyNotFound";
	public static final String COMPANY_NOT_ACTIVE = "companyNotActive";	
	public static final String INVALID_PASSWORD = "invalidPassword";
	public static final String INVALID_TOKEN = "invalidToken";
	public static final String EXPIRED_TOKEN = "expiredToken";

	private static HashMap<Locale, ResourceBundle> languages;	

	static{

		languages = new HashMap<Locale, ResourceBundle>();

		Locale pt_BR = new Locale("pt", "BR");

		languages.put(pt_BR, ResourceBundle.getBundle("Language", pt_BR));

		Locale en_US = new Locale("en", "US");

		languages.put(en_US, ResourceBundle.getBundle("Language", en_US));

	}

	public static String get(String key){

		return languages.get(Locale.getDefault()).getString(key);

	}

	public static String get(String key, Locale locale){

		return languages.get(locale).getString(key);

	}

}