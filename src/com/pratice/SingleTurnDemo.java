package com.pratice;

public class SingleTurnDemo {

	private static SingleTurnDemo singleTurnDemo;

	static {
		singleTurnDemo= new SingleTurnDemo();
	}
	public static SingleTurnDemo getInstanec() {
		return singleTurnDemo;
	}

	private SingleTurnDemo() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}