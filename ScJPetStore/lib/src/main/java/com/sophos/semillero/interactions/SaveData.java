package com.sophos.semillero.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class SaveData implements Interaction {

	private String strKey;
	private Target target;
	
	public SaveData(String strKey, Target target) {
		super();
		this.strKey = strKey;
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String strCadena="%s,%s,,,,%s,%s,%s,%s,%s";
		String[] strValues=new String[7];
		for(int i=1;i<8;i++) {
			strValues[i-1]=Text.of(target.of(String.valueOf(i))).viewedBy(actor).asString();
		}
		strCadena=String.format(strCadena,strValues[0],strValues[1],strValues[2],strValues[3],strValues[4],
				strValues[5],strValues[6]);
		System.out.println(strCadena);
		actor.remember(strKey,strCadena);
	}
	
	public static SaveData value(String strKey, Target target) {
		return instrumented(SaveData.class, strKey, target);
	}
	

}
