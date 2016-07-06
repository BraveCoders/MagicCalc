package com.magiccalc.core;

public class CosExpr extends Expr {
	Expr x;
	public CosExpr(Expr x) {
		this.x=x;
	}
	@Override
	public double getValue(){
		 return Math.cos(this.x.getValue());
		}
	@Override
	public double getValueFor(double x) {
			 return Math.cos(this.x.getValueFor(x));
		}
}
