package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.sophossolutions.ui.CategoryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectItem implements Task{
	
	Target target;
	
	public SelectItem (Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<?> names = CategoryPage.TB_NAMES.resolveAllFor(actor);
		int aleatorio = (int) (Math.random()*(names.size()-2)+2);
		target = Target.the("ID").locatedBy("//tbody//tr[" + aleatorio +"]//td[1]");
		actor.remember("ID_ITEM", target.resolveFor(actor).getText());
		target = Target.the("ID").locatedBy("//tbody//tr[" + aleatorio +"]//td[1]");
		actor.attemptsTo(Click.on(target));
		
	}
	
	public static SelectItem in ( Target target ) {
		return instrumented(SelectItem.class, target);
	}


}
