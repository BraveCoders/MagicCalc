package com.magiccalc.core;

public class Main {
	public static void main(String[] args) {
		ExprFact fuck = new ExprFact();
		Expr ex= fuck.createExpr("20-(10-(5+2)+(4-2-1))+1");
		System.out.println(ex.getValueFor(0));
	}
}