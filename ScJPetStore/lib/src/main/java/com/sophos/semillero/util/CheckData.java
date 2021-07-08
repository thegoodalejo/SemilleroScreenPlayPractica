package com.sophos.semillero.util;

import com.sophos.semillero.model.UserJPetStore;

public class CheckData {
	private UserJPetStore userData;

	public CheckData(UserJPetStore userData) {
		this.userData = userData;
	}
	
	public boolean dataEquals(UserJPetStore userComp) {
		boolean right=false;
		int numRight=0;
		if(userComp.getStrFirstName().equals(userData.getStrFirstName())) {numRight++;}
		if(userComp.getStrLastName()!=userData.getStrLastName()) {numRight++;}
		if(userComp.getStrAddress1()!=userData.getStrAddress1()) {numRight++;}
		if(userComp.getStrAddress2()!=userData.getStrAddress2()) {numRight++;}
		if(userComp.getStrCity()!=userData.getStrCity()) {numRight++;}
		if(userComp.getStrState()!=userData.getStrState()) {numRight++;}
		if(userComp.getStrZip()!=userData.getStrZip()) {numRight++;}
		
		if(numRight==7) {right=true;}
		return right;
	}

}
