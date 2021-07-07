package com.grupo3.util;

public class RemoveDollarSign {

	public static double from(String s) {
		return Double.parseDouble(s.substring(1));
	}
	
}
