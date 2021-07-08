package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import com.sophossolutions.interactions.MapAccount;
import com.sophossolutions.interactions.MapShoppingCar;
import com.sophossolutions.interactions.VectoriceString;
import static com.sophossolutions.ui.StoreCar.BTN_MYACCOUNT;
import static com.sophossolutions.ui.StoreCar.BTN_SHOPPINGCAR;
import static com.sophossolutions.ui.StoreCar.BTN_CHECKOUT;
import static com.sophossolutions.ui.StoreCar.BTN_CONTINUE;
import static com.sophossolutions.ui.StoreCar.BTN_CONFIRM;
import static com.sophossolutions.ui.StoreFacture.LIST_DATAACCOUNTFACTURE;
import static com.sophossolutions.ui.StoreFacture.LIST_DATAPETSFACTURE;
import static com.sophossolutions.ui.StoreFacture.TEXT_ORDER;
import static com.sophossolutions.ui.StoreFacture.LIST_DATAPETFACTURE;
import static com.sophossolutions.ui.StoreCar.TEXT_PETSCAR;

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
				 MapShoppingCar.ofTarget(listDataShoppingCar,TEXT_PETSCAR, "dataPetsOrder"),
				 Click.on(BTN_MYACCOUNT),
				 MapAccount.ofTarget(listDataCurrentAccount, "dataCurrentAccountOrder"),
				 Click.on(BTN_SHOPPINGCAR),
				 Click.on(BTN_CHECKOUT),
				 Click.on(BTN_CONTINUE),
				 Click.on(BTN_CONFIRM),
				 MapAccount.ofTarget(LIST_DATAACCOUNTFACTURE, "dataCurrentAccountFacture"),
				 VectoriceString.with(TEXT_ORDER, "strDataOrder"),
				 MapShoppingCar.ofTarget(LIST_DATAPETSFACTURE, LIST_DATAPETFACTURE, "dataPetsFacture"));		 
	}
	
	public static StoreFinishBuy withValidationof(Target listDataCurrentAccount, Target listDataShoppingCar) {
		return Tasks.instrumented(StoreFinishBuy.class, listDataCurrentAccount, listDataShoppingCar);
	}

}
