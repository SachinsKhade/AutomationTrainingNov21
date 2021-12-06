package com.vst.polymorphism;

import java.util.Random;

public class PhoneUtilities {
	//Random String
	public String getRandomStrings(int length){
		String strValue ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPZXCVBNMLKJHGFDSA";
		String randomString="";
		for(int index=0;index < length ;index++){
		int rnum= (int) Math.floor((Math.random()*strValue.length()));
		randomString +=strValue.substring(rnum, rnum+1);
		}
		return randomString;
		}
	
	public String getRandomMobile_Number() {
		String names[] = { "99","97"};
		String strEmailormobile = (names[new Random().nextInt(names.length)]);
		return strEmailormobile;
	}
	//Random number 
		
		public long getRandomMobile(int length){
			Random random = new Random();
			char[]digit=new char[8]; 
			digit[0]=(char) ((char)random.nextInt(8)+'1');
			for(int i=1;i<digit.length;i++)
			{
				digit[i]=(char)(random.nextInt(10)+'0');
			}
		return Long.parseLong(new String(digit)); 
	}

}
