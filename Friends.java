package com.vst.encapsulation;

public class Friends {

	public static void main(String[] args) {
		Facebookstatus objFacebookstatus =new Facebookstatus();
		//protected
		objFacebookstatus.visible_For_Friends_Or_Friends_Of_Friends();
		//Default
		objFacebookstatus.visible_for_frinds();
		// Public
		objFacebookstatus.visible_For_Public();
		

	}

}
