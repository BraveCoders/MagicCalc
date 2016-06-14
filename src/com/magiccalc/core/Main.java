package com.magiccalc.core;

public class Main {

	public static void main(String[] args) {
		
		ExprFact fuck = new ExprFact();
		Expr ex= fuck.createExpr("4+x+2^2/2");
		
		System.out.println(ex.getValueFor(6));
		
	}

}
