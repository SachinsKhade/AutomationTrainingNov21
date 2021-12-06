package com.vst.polymorphism;

public class TestMusicPlayer {

	public static void main(String[] args) {
		System.out.println("Sony ::");
		Sony objSony =new Sony();
		objSony.play();
		
		System.out.println("Panasonic ::");
		Panasonic ObjPanasonic = new Panasonic();
		ObjPanasonic.Songslibrary();
		
	}

}
