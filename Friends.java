package com.vst.encapsulation1;

import com.vst.encapsulation.*;

public class Friends extends Facebookstatus {

	public static void main(String[] args) {
		Friends objFriends = new Friends();
		
		// protected
		objFriends.visible_For_Friends_Or_Friends_Of_Friends();
		
		// can not access Default method outsite package
		// objFriends.visible_for_frinds();
		
		// Public
		objFriends.visible_For_Public();

	}

}
