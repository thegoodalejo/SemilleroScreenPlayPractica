package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FinalOrderPage {

	public static final Target TXT_ORDER_DATE = Target.the("Numero de orden y fecha").locatedBy("//th[@align='center']");
	public static final Target TXT_FIRSTNAME = Target.the("Primer nombre").locatedBy("//td[text()='First name:']/following-sibling::td");
	public static final Target TXT_LASTNAME = Target.the("Apellido").locatedBy("//td[text()='Last name:']/following-sibling::td");
	public static final Target TXT_ADDRESS = Target.the("Direccion").locatedBy("//td[text()='Address 1:']/following-sibling::td");
	public static final Target TXT_CITY = Target.the("Ciudad").locatedBy("//td[text()='City:']/following-sibling::td");
	public static final Target TXT_STATE = Target.the("Estado").locatedBy("//td[text()='State:']/following-sibling::td");
	public static final Target TXT_ZIP = Target.the("Codigo Postal").locatedBy("//td[text()='Zip:']/following-sibling::td");
	public static final Target TXT_COUNTRY = Target.the("Pais").locatedBy("//td[text()='Country:']/following-sibling::td");
	public static final Target TXT_ID_ITEM = Target.the("Id del item").locatedBy("//a[text()='{0}']");
	public static final Target TXT_TOTAL_PRICE = Target.the("Precio total").locatedBy("//th[@colspan='5']");
	
}
