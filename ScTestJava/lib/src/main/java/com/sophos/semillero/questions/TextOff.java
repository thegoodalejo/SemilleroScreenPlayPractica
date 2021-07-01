package com.sophos.semillero.questions;
import net.serenitybdd.screenplay.targets.Target;
public class TextOff {

	public static TextValue field(Target target) {
		return TextValue.in(target);
	}
	
	public static AccNum of(Target target) {
		return AccNum.in(target);
	}
}
