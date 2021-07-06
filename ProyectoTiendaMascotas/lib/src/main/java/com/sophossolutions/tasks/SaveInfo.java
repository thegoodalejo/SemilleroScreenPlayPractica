package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class SaveInfo implements Task{
	private Target target;
	public SaveInfo(Target target) {
		this.target = target;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember("TextoElemento", Text.of(target).viewedBy(actor).asString());
	}
	public static SaveInfo on (Target target) {
		return instrumented(SaveInfo.class, target);
	}

}
