package com.design.factory.inter;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		if(str.equals("andr")) {
			return new Android();
		}else if(str.equals("wind"))
			return new Windows();
		else
			return new Ios();
	}
}