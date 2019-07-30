package com.design.factory;

import com.design.factory.inter.OS;
import com.design.factory.inter.OperatingSystemFactory;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("andr");
		obj.spec();
	}
}