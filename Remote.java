package com.vst.encapsulation;

public class Remote {
	private boolean onValue;
	Remote()
	{
		onValue=false;
		
	}
public void changeOnValue() {
  System.out.println("The OnValue of the remote has toggled. Check TV ");
  onValue = !onValue;
}

}
