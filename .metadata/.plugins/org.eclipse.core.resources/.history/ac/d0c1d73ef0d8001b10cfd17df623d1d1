package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AliExpressResultPage {

	public static String strNombreArticulo = "//div[%s][@class='_1OUGS']//div[@class='_2mXVg _89Qo8']//a//span";
	public static String strPrecioArticulo = "//div[%s][@class='_1OUGS']//div[@class='_12A8D']";
	
	public static final Target FOOTER = Target.the("Footer de la pagina").locatedBy("//div[@class='footer-copywrite']");
//	public static final Target FOOTER = Target.the("Footer de la pagina").locatedBy("//div[@class='list-pagination']");
    

	
	public static Target getTargetNombre(String index) {		
		return Target.the("El nombre del aticulo").locatedBy(String.format(strNombreArticulo, index));
	}
	
	public static Target getTargetPrecio(String index) {		
		return Target.the("El precio del articul").locatedBy(String.format(strPrecioArticulo, index));
	}
}
