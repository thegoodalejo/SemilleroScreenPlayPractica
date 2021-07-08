package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import com.sophossolutions.interactions.MapAccount;
import com.sophossolutions.interactions.MapShoppingCar;
import static com.sophossolutions.ui.StoreCar.BTN_MYACCOUNT;
import static com.sophossolutions.ui.StoreCar.BTN_SHOPPINGCAR;
import static com.sophossolutions.ui.StoreCar.BTN_CHECKOUT;
import static com.sophossolutions.ui.StoreCar.BTN_CONTINUE;
import static com.sophossolutions.ui.StoreCar.BTN_CONFIRM;

public class StoreFinishBuy implements Task {

	private Target listDataCurrentAccount, listDataShoppingCar;
	
	public StoreFinishBuy(Target listDataCurrentAccount, Target listDataShoppingCar) {
		super();
		this.listDataCurrentAccount = listDataCurrentAccount;
		this.listDataShoppingCar = listDataShoppingCar;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		 actor.attemptsTo(Click.on(BTN_SHOPPINGCAR),
				 MapShoppingCar.ofTarget(listDataShoppingCar),
				 Click.on(BTN_MYACCOUNT),
				 MapAccount.ofTarget(listDataCurrentAccount),
				 Click.on(BTN_SHOPPINGCAR),
				 Click.on(BTN_CHECKOUT),
				 Click.on(BTN_CONTINUE),
				 Click.on(BTN_CONFIRM));		 
	}
	
	public static StoreFinishBuy withValidationof(Target listDataCurrentAccount, Target listDataShoppingCar) {
		return Tasks.instrumented(StoreFinishBuy.class, listDataCurrentAccount, listDataShoppingCar);
	}

}
