package com.magiccalc.core;

public class PowExpr extends Expr {
	Expr x;
	Expr y;
	public PowExpr(Expr x, Expr y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return (Math.pow(this.x.getValue(),this.y.getValue()));
	}

	@Override
	public double getValueFor(double x) {
		// TODO Auto-generated method stub
		return (Math.pow(this.x.getValueFor(x),this.y.getValueFor(x)));
	}

}
