package com.sophos.semillero.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophos.semillero.model.Cart;
import com.sophos.semillero.model.Item;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class Validation {
	
	private static Boolean itemsInCart(List<Item> listItemsActor, List<WebElementFacade> listItemsWeb) {
			
		boolean isValid = true;
		
		for (int i = 0; i < listItemsActor.size(); i++) {
			
			WebElement item = listItemsWeb.get(i);			
			String itemIDWeb = item.findElements(By.tagName("td")).get(0).findElement(By.tagName("a")).getText();
			
			if(!listItemsActor.contains(new Item(itemIDWeb))) {
				isValid = false;
			}
			
		}		
		return isValid;
	}
		
	public static Boolean addItemToCart(Actor actor, Target car_list) {
		
		List<WebElementFacade> listItemsWeb = car_list.resolveAllFor(actor);
		
		Cart cartActor = actor.recall("CART");
		List<Item> listItemsActor = cartActor.getListItems();
		
		//Valida los items en carrito
		boolean result = itemsInCart(listItemsActor, listItemsWeb);
		
		if(result) {
					
			//completa el modelo
			for (int i = 0; i < listItemsWeb.size() - 1; i++) {						
			
				WebElement item = listItemsWeb.get(i);
				List<WebElement> listTd = item.findElements(By.tagName("td"));				
				
				listItemsActor.get(i).setDescription(listTd.get(2).getText());
				listItemsActor.get(i).setInStock(Boolean.valueOf(listTd.get(3).getText()));
				
				String quantity = listTd.get(4).findElement(By.tagName("input")).getAttribute("value");
				listItemsActor.get(i).setQuantity(quantity);
				listItemsActor.get(i).setListPrice(listTd.get(5).getText());
				listItemsActor.get(i).setTotalCost(listTd.get(6).getText());			
			
			}
			
			//subtotal
			WebElement trSubtotal = listItemsWeb.get(listItemsWeb.size() - 1);
			String strSubtotal = trSubtotal.findElement(By.tagName("td")).getText();
			
			cartActor.setSubTotal(strSubtotal);			
			actor.remember("CART", cartActor);			
			
			return true;
		} else {
			return false;
		}
	}
				
		
	
	public static Boolean removeItemFromCart(Actor actor, Target car_list) {
		List<WebElementFacade> listItemsWeb = car_list.resolveAllFor(actor);
		Cart cartActor = actor.recall("CART");
		List<Item> listItemsActor = cartActor.getListItems();
				
		return itemsInCart(listItemsActor, listItemsWeb);
	}
	
	
	public static Boolean orderInvoice(Actor actor, Target itemList) {
		
		List<WebElementFacade> listItemsWeb = itemList.resolveAllFor(actor);
		
		Cart cartActor = actor.recall("CART"); 
		List<Item> listItemsActor = cartActor.getListItems();
		
		boolean right=false;
		int numRight=0;
		
		for (int i = 0; i < listItemsActor.size(); i++) {
			WebElement item = listItemsWeb.get(i);			
			String itemIDWeb = item.findElements(By.tagName("td")).get(0).findElement(By.tagName("a")).getText();
			String strDescripcion = item.findElements(By.tagName("td")).get(1).getText();
			String strQuanty = item.findElements(By.tagName("td")).get(2).getText();
			String strPrice = item.findElements(By.tagName("td")).get(3).getText();
			String strTotal = item.findElements(By.tagName("td")).get(4).getText();
			
			if(listItemsActor.get(i).getItemID().equals(itemIDWeb)) {numRight++;}
			if(listItemsActor.get(i).getDescription().equals(strDescripcion)) {numRight++;}
			if(listItemsActor.get(i).getQuantity().equals(strQuanty)) {numRight++;}
			if(listItemsActor.get(i).getListPrice().equals(strPrice)) {numRight++;}
			if(listItemsActor.get(i).getTotalCost().equals(strTotal)) {numRight++;}
			
			if(numRight==5) {
				right=true;
				numRight=0;
			}else {
				return false;
				}
		}
		return right;
		
	}

}
