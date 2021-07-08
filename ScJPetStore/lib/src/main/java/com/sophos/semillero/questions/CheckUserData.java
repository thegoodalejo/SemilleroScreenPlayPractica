package com.sophos.semillero.questions;

import com.sophos.semillero.model.UserJPetStore;
import com.sophos.semillero.util.CheckData;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class CheckUserData implements Question<Boolean>{

	private Target tarUser;
	private UserJPetStore userData;
	

	public CheckUserData(Target tarUser, UserJPetStore userData) {
		this.tarUser = tarUser;
		this.userData = userData;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		String[] strData= new String[7];
		for(int i=0;i<7;i++) {
			strData[i]=Text.of(tarUser.of(String.valueOf(i+1))).viewedBy(actor).asString();
		}
		UserJPetStore userComp= new UserJPetStore(strData[0],strData[1],strData[2],
				strData[3],strData[4],strData[5],strData[6]);
		CheckData checkVerificar=new CheckData(userComp);
		return checkVerificar.dataEquals(userData);
	}
	
	public static CheckUserData  on(Target text,UserJPetStore userData) {
		return new CheckUserData(text,userData);
	}
	
}
