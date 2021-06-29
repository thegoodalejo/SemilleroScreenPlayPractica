package com.sophos.semillero.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Result implements Question<Boolean>{

	private Target NombreArticulo;
	private Target PrecioArticulo;
	
	public Result(Target nombrearticulo, Target precioarticulo) {
		this.NombreArticulo = nombrearticulo;
		this.PrecioArticulo = precioarticulo;
	}
	@Override
	public Boolean answeredBy(Actor actor) {
		
		System.out.println("Producto: " + Text.of(NombreArticulo).viewedBy(actor).asString());
		System.out.println("Precio: " + Text.of(PrecioArticulo).viewedBy(actor).asString());
		return true;
	}
	
	public static Result  in(Target nombreArticulo, Target precioArticulo) {
		return new Result(nombreArticulo,precioArticulo);
	}
	
}
