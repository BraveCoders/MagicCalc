package com.magiccalc.core;

public class Main {

	public static void main(String[] args) {
		
		ExprFact fuck = new ExprFact();
		Expr ex= fuck.createExpr("4/1/2");

		System.out.println(ex.getValue());
		
	}

}
