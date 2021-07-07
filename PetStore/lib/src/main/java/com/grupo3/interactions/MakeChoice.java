package com.grupo3.interactions;

import com.grupo3.model.Animal;
import com.grupo3.ui.ProductPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

public class MakeChoice implements Task{

	int chosenElement;
	
	public MakeChoice(int id) {
		this.chosenElement = id;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.print("Se eligió aleatoriamente el producto con ID: ");
		System.out.println(Text.of(ProductPage.getItemIDNo(chosenElement)).viewedBy(actor).asString());
		
		Animal a = new Animal(
					Text.of(ProductPage.getItemIDNo(chosenElement)).viewedBy(actor).asString(),
					Text.of(ProductPage.getProductIDNo(chosenElement)).viewedBy(actor).asString(),
					Text.of(ProductPage.getListPriceNo(chosenElement)).viewedBy(actor).asString()
				);
		actor.remember("ADDED_ANIMAL", a);
		
		
	}
	
	public static MakeChoice ofElement(int id) {
		return instrumented(MakeChoice.class, id);
	}
	
	
	
}
