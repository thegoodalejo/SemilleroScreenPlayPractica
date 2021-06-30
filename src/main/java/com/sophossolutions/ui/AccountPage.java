package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {

	public static final Target LINK_ACCOUNT_DETAILS= Target.the("Numero de cuenta").locatedBy("//a[@id='newAccountId']");
	public static final Target LINK_ACCOUNTS_OVERVIEW = Target.the("Link Accouts Overview").locatedBy("//a[@href='/parabank/overview.htm']");

	//table[@id='accountTable']
	//tr[@ng-repeat='account in accounts']
	//tr[@ng-repeat='account in accounts'][i]//td[3]
	//tr[@ng-repeat='account in accounts'][i]//td[1]
}
