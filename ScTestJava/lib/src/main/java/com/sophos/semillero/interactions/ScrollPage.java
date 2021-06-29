package com.sophos.semillero.interactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPage {

	public static void scrollDown(WebDriver myBrowser) {
		JavascriptExecutor js = (JavascriptExecutor) myBrowser;
		for (int i = 10; i <= 100; i+=10)
		js.executeScript("window.scrollTo("+ (i-10)/100.0 + "*document.body.scrollHeight,"
		+ i/100.0 + "*document.body.scrollHeight) ");
		}
}
