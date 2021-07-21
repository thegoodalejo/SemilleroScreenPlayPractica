package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserDevicesPage {
	
	public static final Target BTN_NEXT_PAGE = Target.the("Subbmit data").locatedBy("//a[@class='btn btn-blue pull-right']");
	public static final Target ACTIVATE_EDIT_TEXT_OS = Target.the("Activate edit text O.S.").locatedBy("//div[@id='web-device']//span[@aria-label='Select OS']");
	public static final Target ACTIVATE_EDIT_TEXT_VERSION = Target.the("Activate edit text Version").locatedBy("//div[@id='web-device']//span[@aria-label='Select a Version']");
	public static final Target ACTIVATE_EDIT_TEXT_LANGUAGE = Target.the("Activate edit text language").locatedBy("//div[@id='web-device']//span[@aria-label='Select OS language']");
	public static final Target ACTIVATE_EDIT_TEXT_BRAND = Target.the("Activate edit text Brand").locatedBy("//div[@id='mobile-device']//span[@aria-label='Select Brand']");
	public static final Target ACTIVATE_EDIT_TEXT_MODEL = Target.the("Activate edit text Model").locatedBy("//div[@id='mobile-device']//span[@aria-label='Select a Model']");
	public static final Target ACTIVATE_EDIT_TEXT_MODEL_VERSION = Target.the("Activate edit text Model version").locatedBy("//div[@id='mobile-device']//span[@aria-label='Select OS']");
	public static final Target EDIT_TEXT_OS = Target.the("Edit text O.S.").locatedBy("//div[@id='web-device']//input[@placeholder='Select OS']");
	public static final Target EDIT_TEXT_VERSION = Target.the("Edit text of version").locatedBy("//div[@id='web-device']//input[@placeholder='Select a Version']");
	public static final Target EDIT_TEXT_LANGUAGE = Target.the("Edit text of version").locatedBy("//div[@id='web-device']//input[@placeholder='Select OS language']");
	public static final Target EDIT_TEXT_BRAND = Target.the("Edit text Brand").locatedBy("//div[@id='mobile-device']//input[@placeholder='Select Brand']");
	public static final Target EDIT_TEXT_MODEL = Target.the("Edit text Model").locatedBy("//div[@id='mobile-device']//input[@placeholder='Select a Model']");
	public static final Target EDIT_TEXT_MODEL_VERSION = Target.the("Edit text Model version").locatedBy("//div[@id='mobile-device']//input[@placeholder='Select OS']");
	public static final Target OPTION = Target.the("Option In search").locatedBy("//span[@class='ui-select-choices-row-inner']");
	
}
