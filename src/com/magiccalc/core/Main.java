package com.magiccalc.core;

public class Main {
	public static void main(String[] args) {
		GuiCalc gui = new GuiCalc();
		ExprFact fuck = new ExprFact();
		Expr ex= fuck.createExpr("sin(x-1)");
		System.out.println(ex.getValueFor(0));
	}
}