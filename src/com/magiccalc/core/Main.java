package com.magiccalc.core;

public class Main {

	public static void main(String[] args) {

		System.out.println(new AddExpr(
				new ConstExpr("500"), 
				new ConstExpr("60000000")).getValue());
		
	}

}
