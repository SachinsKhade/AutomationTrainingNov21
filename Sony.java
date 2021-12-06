package com.vst.polymorphism;

public class Sony extends Music {
	Sony() {
		System.out.println("Sony Operations..........");
		System.out.println("----------------------------------------------");
	}
@Override
	public void play()
{
		System.out.println("Sony:: Playing Music.........");
		System.out.println("----------------------------------------------");
	}
}
