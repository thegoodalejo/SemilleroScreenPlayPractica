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

public class MapShoppingCar implements Interaction{

	private Target listDataShoppingCar;
	
	public MapShoppingCar(Target listDataCurrentAccount) {
		super();
		this.listDataShoppingCar = listDataCurrentAccount;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		List<WebElementFacade> dataPets = listDataShoppingCar.resolveAllFor(actor);
		List<PetsCarModel> petsShoppingCar = new ArrayList<PetsCarModel>();
		
		for(int i=0; i< dataPets.size(); i++) {
			List<WebElementFacade> dataPet = TEXT_PETSCAR.of(String.valueOf(i+1)).resolveAllFor(actor);
			List<WebElementFacade> quantitiesAccount = TEXT_QUANTITIES.of(String.valueOf(i+1)).resolveAllFor(actor);
			
			PetsCarModel pet = new PetsCarModel(dataPet.get(0).getText(), 
					dataPet.get(2).getText(), quantitiesAccount.get(0).getValue(),
					dataPet.get(5).getText(), dataPet.get(6).getText());
			
			petsShoppingCar.add(pet);
		}
		
		actor.remember("petsShoppingCar", petsShoppingCar);

	}
	
	
	public static MapShoppingCar ofTarget(Target listDataShoppingCar) {
		return Tasks.instrumented(MapShoppingCar.class,listDataShoppingCar );
	}



}
