package com.magiccalc.core;

public class CotExpr extends Expr {
	Expr x;
	public CotExpr(Expr x) {
		this.x=x  ;
	}
	@Override
	public double getValue(){
		 return Math.tan(1/this.x.getValue());
	}
	@Override
	public double getValueFor(double x) {
		 return Math.tan(1/this.x.getValueFor(x));
	}
}
