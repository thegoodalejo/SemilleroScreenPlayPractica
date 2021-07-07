package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class prueba implements Task {

	private Target linkPage;
	private Target options;

	public prueba(Target linkpage, Target opt){
		this.linkPage = linkpage;
		this.options = opt;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
//		int accounts = options.resolveAllFor(actor).size();
//		int randomValue = 1 + (int)(Math.random() * accounts);
//		System.out.println(randomValue);
		
		System.out.println("Esta vaina que ?   " + Text.of(By.name("WelcomeContent")).viewedBy(actor).asString());
		
	}
	public static prueba animal(Target linkpage,Target opt) {
		return instrumented(prueba.class, linkpage,opt);
	}

}
