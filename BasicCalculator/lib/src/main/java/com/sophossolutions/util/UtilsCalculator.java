package com.sophossolutions.util;

import static com.sophossolutions.constants.Constants.ADD;
import static com.sophossolutions.constants.Constants.ID_ANSWER;
import static com.sophossolutions.constants.Constants.ID_DATA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.Map;

import com.sophossolutions.questions.TextCalulate;

import net.serenitybdd.screenplay.Actor;

public class UtilsCalculator {

	public static String getData(String strIndexOperation, Integer intNum1, Integer intNum2) {
		if (strIndexOperation.equals("0")) {
			return Integer.toString(intNum1+intNum2);
		}else if (strIndexOperation.equals("1")) {
			return Integer.toString(intNum1-intNum2);
		}else if (strIndexOperation.equals("2")) {
			return Integer.toString(intNum1*intNum2);
		}else if (strIndexOperation.equals("3")) {
			return Double.toString( intNum1.doubleValue()/intNum2.doubleValue() );
		}else if (strIndexOperation.equals("4")) {
			return intNum1.toString() + intNum2.toString();
		}
		return null;
	}

	public static void verifyDataObtainedWith(Actor actor, String strOperation) {
		Map<String, Object> dataActor = actor.recallAll();
		actor.should(seeThat(
				TextCalulate.in(dataActor.get(ID_ANSWER + strOperation)),
						equalTo(dataActor.get(ID_DATA + strOperation))
							)
					);	
	}
	
}
