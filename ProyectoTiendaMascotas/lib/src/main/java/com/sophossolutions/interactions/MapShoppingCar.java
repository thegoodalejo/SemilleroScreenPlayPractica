package com.sophossolutions.interactions;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import com.sophossolutions.models.PetsCarModel;
import static com.sophossolutions.ui.StoreCar.TEXT_PETSCAR;
import static com.sophossolutions.ui.StoreCar.TEXT_QUANTITIES;

public class MapShoppingCar implements Interaction {

	private Target listDataShoppingCar;
	private Target listDataPetCar;
	private String strKey;

	public MapShoppingCar(Target listDataShoppingCar, Target listDataPetCar, String strKey) {
		super();
		this.listDataShoppingCar = listDataShoppingCar;
		this.listDataPetCar = listDataPetCar;
		this.strKey = strKey;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		List<WebElementFacade> dataPets = listDataShoppingCar.resolveAllFor(actor);

		List<List<String>> petsData = new ArrayList<List<String>>();

		for (int i = 0; i < dataPets.size(); i++) {

			List<WebElementFacade> dataPet = listDataPetCar.of(String.valueOf(i + 1)).resolveAllFor(actor);
			

			List<String> petData = new ArrayList<String>();

			if (dataPet.size() > 5 ) {
				List<WebElementFacade> quantitiesAccount = TEXT_QUANTITIES.of(String.valueOf(i + 1)).resolveAllFor(actor);
				petData.add(dataPet.get(0).getText());
				petData.add(dataPet.get(2).getText());
				petData.add((quantitiesAccount.get(0).getValue()));
				petData.add(dataPet.get(5).getText());
				petData.add(dataPet.get(6).getText());

			} else {

				petData.add(dataPet.get(0).getText());
				petData.add(dataPet.get(1).getText());
				petData.add(dataPet.get(2).getText());
				petData.add(dataPet.get(3).getText());
				petData.add(dataPet.get(4).getText());

			}

			/*
			 * petsCarModel pet = new PetsCarModel(dataPet.get(0).getText(),
			 * dataPet.get(2).getText(), quantitiesAccount.get(0).getValue(),
			 * dataPet.get(5).getText(), dataPet.get(6).getText());
			 * 
			 * petsShoppingCar.add(pet);
			 */
			petsData.add(petData);
		}

		// actor.remember("petsShoppingCar", petsShoppingCar);

		actor.remember(strKey, petsData);
	}

	public static MapShoppingCar ofTarget(Target listDataShoppingCar, Target listDataPetCar, String strKey) {
		return Tasks.instrumented(MapShoppingCar.class, listDataShoppingCar,listDataPetCar , strKey);
	}

}
