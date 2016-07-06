package com.magiccalc.core;

public class SinExpr extends Expr{
	Expr x;
	public SinExpr(Expr x) {
		this.x=x;
	}
	@Override
	public double getValue(){
	 return Math.sin(this.x.getValue());
	}
	@Override
	public double getValueFor(double x) {
		 return Math.sin(this.x.getValueFor(x));
	}

}