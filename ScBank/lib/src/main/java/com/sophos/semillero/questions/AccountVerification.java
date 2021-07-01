package com.sophos.semillero.questions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.sophos.semillero.tasks.ConsultAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class AccountVerification implements Question<Boolean> {

	private Target strAccountFromTable;
	
	public AccountVerification(Target target) {
		this.strAccountFromTable = target;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
			String newAccountNumber = theActorInTheSpotlight().recall("New account Number");				
			actor.wasAbleTo(ConsultAccount.go());//Dirige a la pagina overview			
			
			strAccountFromTable = strAccountFromTable.of(newAccountNumber);//Modifica el xpath			
			WebElement trParent = strAccountFromTable.resolveFor(actor).findElement(By.xpath(strAccountFromTable.getCssOrXPathSelector()+"//..//.."));			
			WebElement tdAvailableAmount = trParent.findElement(By.xpath("td[3]")); //Obtiene td del monto disponible			
			System.out.println(tdAvailableAmount.getText());			
			return true;			
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static AccountVerification in(Target target) {		
		return new AccountVerification(target);
	}
	
}
