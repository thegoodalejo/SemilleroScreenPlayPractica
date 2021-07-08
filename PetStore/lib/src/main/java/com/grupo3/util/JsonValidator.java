package com.grupo3.util;

import io.restassured.response.Response;

public class JsonValidator {
	
	private String route;
	private Object expectedValue;
	private Class type;
	
	
	public JsonValidator(String route, Object expected_value) {
		this.route = parseRoute(route);
		this.expectedValue = expected_value;
		this.type = expected_value.getClass();
	}
	
	private String parseRoute(String initialRoute) {
		String[] routeParts = initialRoute.split("/");
		return String.join(".", routeParts);
	}
	
	public boolean isValidForResponse(Response r) {
		if (this.type.isInstance(r.jsonPath().get(this.route))) {
			return r.jsonPath().get(this.route).equals(this.expectedValue);
		} else {
			return false;
		}
	}
	
}
