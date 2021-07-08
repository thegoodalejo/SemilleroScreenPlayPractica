package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.grupo3.util.Constants.AUTH_TOKEN;

import com.grupo3.interactions.ClickRandomAddToCartButton;
import com.grupo3.interactions.ClickRandomElement;
import com.grupo3.ui.CategoryPage;
import com.grupo3.ui.MainPage;
import com.grupo3.ui.ProductPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class AddARandomProductToCart implements Task{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
					ClickRandomElement.from(MainPage.CATEGORIES),
					ClickRandomElement.from(CategoryPage.PRODUCT_LINKS),
					ClickRandomAddToCartButton.from(ProductPage.ELEMENTS_AVAILABLE)
				);
		
	}
	
	public static AddARandomProductToCart addARandomProductToCart() {
		return instrumented(AddARandomProductToCart.class);
	}
	
	

}
