package com.sophossolutions.interactions;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import com.sophossolutions.models.AccountModel;

public class MapAccount implements Interaction {

	private Target listDataCurrentAccount;
	private String strKeyData;

	public MapAccount(Target listDataCurrentAccount, String strKeyData) {
		super();
		this.listDataCurrentAccount = listDataCurrentAccount;
		this.strKeyData = strKeyData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		List<WebElementFacade> dataAccounts = listDataCurrentAccount.resolveAllFor(actor);
		List<String> dataAccount = new ArrayList<String>();

		for (int i = 0; i < dataAccounts.size(); i++) {
			if (dataAccounts.size() > 9) {
				dataAccount.add(dataAccounts.get(i).getValue());
			} else {
				dataAccount.add(dataAccounts.get(i).getText());
			}
		}

		if (dataAccounts.size() > 9) {
			AccountModel dataCurrentAccount = new AccountModel(dataAccount.get(0), dataAccount.get(1),
					dataAccount.get(4), dataAccount.get(5), dataAccount.get(6), dataAccount.get(7), dataAccount.get(8),
					dataAccount.get(9));
			actor.remember(strKeyData, dataCurrentAccount);
		} else {
			AccountModel dataCurrentAccount = new AccountModel(dataAccount.get(0), dataAccount.get(1),
					dataAccount.get(2), dataAccount.get(3), dataAccount.get(4), dataAccount.get(5), dataAccount.get(6),
					dataAccount.get(7));
			actor.remember(strKeyData, dataCurrentAccount);
		}
	}

	public static MapAccount ofTarget(Target listDataCurrentAccount, String strKeyData) {
		return Tasks.instrumented(MapAccount.class, listDataCurrentAccount, strKeyData);
	}

}
