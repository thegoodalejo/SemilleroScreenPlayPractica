package com.sophos.semillero.questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class AccountVerification implements Question<Boolean> {

	private Target strAccountFromTable;
	private String newNumberAccount;
	
	public AccountVerification(Target target, String newNumberAccount) {
		this.strAccountFromTable = target;
		this.newNumberAccount = newNumberAccount;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {	
		try {
			List<WebElementFacade> listTr = strAccountFromTable.resolveAllFor(actor);
			
			Boolean matchAccount = false;
			
			for (int i = 1; i < listTr.size(); i++) {
				WebElement tdNumberAcount =  listTr.get(i).findElements(By.tagName("td")).get(0);				
				String numberAcount = tdNumberAcount.findElement(By.tagName("a")).getText();
				
				if(newNumberAccount.equals(numberAcount)) {					
					matchAccount = true;
					WebElement tdAvailableAmount =  listTr.get(i).findElements(By.tagName("td")).get(2);
					System.out.println(tdAvailableAmount.getText());
					break;
				}
			}
			
			return matchAccount;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static AccountVerification in(Target target, String newNumberAccount) {		
		return new AccountVerification(target, newNumberAccount);
	}
	
}
