package com.magiccalc.core;

public class MulExpr extends Expr{
	Expr x;
	Expr y;
	public MulExpr(Expr x,Expr y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	public double getValue(){
		return (this.x.getValue()*this.y.getValue());
	}
	@Override
	public double getValueFor(double x) {
		// TODO Auto-generated method stub
		return (this.x.getValueFor(x)*this.y.getValueFor(x));
	}
}
