package com.grupo3.util;

import java.util.LinkedList;

public class RemoveCharacters {
	
	private int start;
	private int end;
	private String text;
	
	public RemoveCharacters(int start) {
		this.start = start;
	}
	
	public static RemoveCharacters keepCharacters(int i) {
		return new RemoveCharacters(i);
	}
	
	public RemoveCharacters through(int i) {
		this.end = i;
		return this;
	}
	
	public String ofString(String text) {
		this.text = text;
		return trimmedText();
	}
	
	private String trimmedText() {
		char[] charsInText = text.toCharArray();
		String res = "";
		for (int i = 0; i < charsInText.length; i++) {
			if (i >= start && i <= end) {
				res += charsInText[i];
			}
		}
		return res;
	}

}
