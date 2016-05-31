package com.magiccalc.core;

public class ConstExpr extends Expr {
	double x;
	public ConstExpr(String x){
		this.x=Double.parseDouble(x);
	}
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return x;
	}
}
