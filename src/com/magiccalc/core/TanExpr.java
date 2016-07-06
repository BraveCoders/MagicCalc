package com.magiccalc.core;

public class TanExpr extends Expr {
	Expr x;
	public TanExpr(Expr x) {
		this.x=x;
	}
	@Override
	public double getValue(){
		 return Math.tan(this.x.getValue());
	}
	@Override
	public double getValueFor(double x) {
		 return Math.tan(this.x.getValueFor(x));
	}
}
