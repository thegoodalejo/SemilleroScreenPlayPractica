package com.sophossolutions.interactions;

import static com.sophossolutions.ui.StoreHome.BTN_ADD;
import static com.sophossolutions.ui.StoreHome.PET_BREED;
import static com.sophossolutions.ui.StoreHome.PET_TYPE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class AddPets implements Interaction {

	private String strType, strBreed, strDescription;

	public AddPets(String strType, String strBreed, String strDescription) {
		super();
		this.strType = strType;
		this.strBreed = strBreed;
		this.strDescription = strDescription;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		String[] strTypeArray = strType.split("-");
		String[] strBreedArray = strBreed.split("-");
		String[] strDescriptionArray = strDescription.split("-");

		for (int i = 0; i < strTypeArray.length; i++) {
			actor.attemptsTo(ClickButton.elementTarget(PET_TYPE.of(strTypeArray[i])),
					ClickButton.elementTarget(PET_BREED.of(strBreedArray[i])),
					ClickButton.elementTarget(BTN_ADD.of(strDescriptionArray[i])));
		}

	}

	public static AddPets with(String strType, String strBreed, String strDescription) {
		return Tasks.instrumented(AddPets.class, strType, strBreed, strDescription);
	}

}
