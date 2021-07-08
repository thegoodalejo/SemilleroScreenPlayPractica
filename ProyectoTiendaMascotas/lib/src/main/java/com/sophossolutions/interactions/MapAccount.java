package com.sophossolutions.interactions;

import static com.sophossolutions.ui.StoreCar.TEXT_PETSCAR;
import static com.sophossolutions.ui.StoreCar.TEXT_QUANTITIES;

import java.util.ArrayList;
import java.util.List;

import com.sophossolutions.models.PetsCarModel;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import com.sophossolutions.models.RegisterModel;

public class MapAccount implements Interaction {

	private Target listDataCurrentAccount;

	public MapAccount(Target listDataCurrentAccount) {
		super();
		this.listDataCurrentAccount = listDataCurrentAccount;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		List<WebElementFacade> dataAccounts = listDataCurrentAccount.resolveAllFor(actor);

		List<String> dataAccount = new ArrayList<String>();

		for (int i = 0; i < dataAccounts.size(); i++) {
			dataAccount.add(dataAccounts.get(i).getValue());
		}

		RegisterModel dataCurrentAccount = new RegisterModel(dataAccount.get(0), dataAccount.get(1), dataAccount.get(4),
				dataAccount.get(5), dataAccount.get(6), dataAccount.get(7), dataAccount.get(8), dataAccount.get(9));

		actor.remember("dataCurrentAccount", dataCurrentAccount);
	}

	public static MapAccount ofTarget(Target listDataCurrentAccount) {
		return Tasks.instrumented(MapAccount.class, listDataCurrentAccount);
	}

}
