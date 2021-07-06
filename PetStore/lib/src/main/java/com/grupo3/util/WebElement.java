package com.grupo3.util;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;

public class WebElement {

	int ganasDeMorir;
	
	public WebElement(int el) {
		this.ganasDeMorir = el;
	}
	
	public WebElementFacade fromList(List<WebElementFacade> elements) {
		return elements.get(this.ganasDeMorir);
	}
	
	public static WebElement elementNo(int i) {
		return new WebElement(i);
	}
	
}
