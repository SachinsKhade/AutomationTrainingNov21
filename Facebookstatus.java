package com.vst.encapsulation;

public class Facebookstatus {

	public void visible_For_Public() {
		System.out.println("Facebook Status");
	}

	private void visible_Only_For_Me() {
		System.out.println("Facebook Status");
	}

	protected void visible_For_Friends_Or_Friends_Of_Friends() {
		System.out.println("Facebook Status");
	}
	
	void visible_for_frinds()
	{
		System.out.println("Facebook Status");
	}

	public static void main(String[] args) {
		Facebookstatus objFacebookstatus = new Facebookstatus();
		objFacebookstatus.visible_Only_For_Me();

	}
}
