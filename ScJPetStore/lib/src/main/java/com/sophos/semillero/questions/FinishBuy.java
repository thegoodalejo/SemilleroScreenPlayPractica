package com.sophos.semillero.questions;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.Actor;

public class FinishBuy implements Question<String>{

	private Target tarObtenido;
	private boolean boolQuantity;
	private int intSelectValue;
	
	public FinishBuy(Target tarObtenido) {
		this.tarObtenido = tarObtenido;
		this.boolQuantity=false;
	}
	
	public FinishBuy(Target tarObtenido,int intSelectValue) {
		this.tarObtenido = tarObtenido;
		this.boolQuantity=true;
		this.intSelectValue=intSelectValue;
	}
	
	@Override
	public String answeredBy(Actor actor) {
		String strValue=Text.of(tarObtenido).viewedBy(actor).asString();
		if (boolQuantity) {
			String[] strValues=strValue.split(" ");
			System.out.println(strValues[intSelectValue]);
			return strValues[intSelectValue];
		}else {
			return Text.of(tarObtenido).viewedBy(actor).asString();
		}
	}
	
	public static FinishBuy  on(Target text) {
		return new FinishBuy(text);
	}
	
	public static FinishBuy  on(Target text,int intList) {
		return new FinishBuy(text,intList);
	}	
}