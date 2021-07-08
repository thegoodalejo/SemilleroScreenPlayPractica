package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.ArrayList;

import com.sophos.semillero.model.Cart;
import com.sophos.semillero.model.Item;
import com.sophos.semillero.model.UserJPetStore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SaveModel implements Task {

	private String strName;
	private Object objModel;

	public SaveModel(String strName,Object objModel) {
		this.strName = strName;
		this.objModel = objModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(strName,objModel);
	}
	
	public static SaveModel user(String strInfo,String strName){
		String[] strValues=strInfo.split(",");
		String strFirstName=strValues[0];
		String strLastName=strValues[1];
		String strAddress1=strValues[8];
		String strAddress2=strValues[9];
		String strCity=strValues[5];
		String strState=strValues[6];
		String strZip=strValues[7];
		
		UserJPetStore dataUser=new UserJPetStore(strFirstName,strLastName,strAddress1,strAddress2,
				strCity,strState,strZip);
		return instrumented(SaveModel.class,strName,dataUser);		
	}
	
	public static SaveModel addedItemCart(String strName, String strCategoria, String strProductoId, String strItemId) {
		
		Item item = new Item(strItemId, strProductoId);
		
		Cart cart = theActorInTheSpotlight().recall("CART");
		
		//en caso que el carrito esté vacío
		if(cart == null) {			
			
			ArrayList<Item> listaItems = new ArrayList<Item>();
			listaItems.add(item);
			cart = new Cart(listaItems); 
			
			return instrumented(SaveModel.class, strName, cart);
		} else {
			cart.getListItems().add(item);			
			return instrumented(SaveModel.class, strName, cart);
		}
	}
	
	public static SaveModel deletedItemCart(String strName, String itemId) {
		
		Cart cart = theActorInTheSpotlight().recall("CART");
		cart.getListItems().remove(new Item(itemId));
		
		return instrumented(SaveModel.class, strName, cart);
	}
	
	public static SaveModel updatedItemCart(String strName, String itemId, String newQuantity) {
		
		Cart cart = theActorInTheSpotlight().recall("CART");
		int indexOf = cart.getListItems().indexOf(new Item(itemId));
		cart.getListItems().get(indexOf).setQuantity(newQuantity);
		
		return instrumented(SaveModel.class, strName, cart);
	}


}